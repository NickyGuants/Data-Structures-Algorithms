package com.nicky.tries;

import java.util.HashMap;

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

//        public Node[] getChidren(){
//            return hashChildren.values().toArray(new Node[0]);
//        }
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

}
