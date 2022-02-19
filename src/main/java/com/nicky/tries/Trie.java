package com.nicky.tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trie {
    public static int ALPHABET_SIZE=26;
    private class Node{
        private char value;
        private Node[] children = new Node[ALPHABET_SIZE];
        private HashMap<Character, Node> hashChildren = new HashMap<>();
        private Boolean isEndOfWord;

        public Node(char value){
            this.value=value;
        }

        @Override
        public String toString() {
            return "value=" + value;

        }

        public Node[] getChidren(){
            return hashChildren.values().toArray(new Node[0]);
        }

        public boolean hasChild(char ch){
            return hashChildren.containsKey(ch);
        }

        public Node getChild(char ch){
            return hashChildren.get(ch);
        }
        public void addChild(char ch){
            hashChildren.put(ch, new Node(ch));
        }

        public boolean hasChildren(){
            return !hashChildren.isEmpty();
        }

        public void removeChild(char ch){
            hashChildren.remove(ch);
        }
    }
    private Node root = new Node(' ');

    //using an array. Too expensive in terms of space complexity
    public void insert(String word){
        var current = root;
        for (var ch: word.toCharArray()){
            var index = ch - 'a';
            if (current.children[index]==null){
                current.children[index]=new Node(ch);
            }
            current=current.children[index];
        }
        current.isEndOfWord=true;
    }
    //using a hashmap less space required
    public void insertUsingHashTable(String word){
        var current = root;
        for (var ch: word.toCharArray()){
            if (current.hashChildren.get(ch)==null){
                current.hashChildren.put(ch, new Node(ch));
            }
            current=current.hashChildren.get(ch);
        }
        current.isEndOfWord=true;
    }

    public boolean contains(String word){
        if (word==null) return false;
        var current = root;
        for (var ch: word.toCharArray()){
            if (current.hashChildren.get(ch)==null){
                return false;
            }
            current=current.hashChildren.get(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse(){
        traverse(root);
    }

    private void traverse(Node root){
        //pre-order
        System.out.println(root.value);

        for (var child: root.getChidren()){
            traverse(child);
        }

        //post-order
        //System.out.println(root.value);
    }

    public void remove(String word){
        if (word==null){
            return;
        }
        remove(root, word, 0);
    }

    private void remove(Node root, String word, int index){
        if (index==word.length()){
            root.isEndOfWord=false;
            return;
        }

        var ch = word.charAt(index);
        var child =root.getChild(ch);
        if (child==null){
            return;
        }
        remove(child, word, index+1);
        if (!child.hasChildren() && !child.isEndOfWord){
            root.removeChild(ch);
        }
    }

    public List<String> findWords (String prefix){
        List<String > words = new ArrayList<>();
        var lastNode = findLastNodeOf(prefix);
        findWords(lastNode, prefix, words);
        return words;
    }

    private void findWords(Node root, String prefix, List<String> words){
        if (root==null){
            return;
        }
        if (root.isEndOfWord){
            words.add(prefix);
        }
        for (var child: root.getChidren()){
            findWords(child, prefix+child.value, words);
        }
    }

    private Node findLastNodeOf(String prefix){
        if (prefix==null){
            return null;
        }
        var current = root;
        for (var ch: prefix.toCharArray()){
            var child = current.getChild(ch);
            if (child==null)
                return null;
            current=child;
        }
        return current;
    }
}
