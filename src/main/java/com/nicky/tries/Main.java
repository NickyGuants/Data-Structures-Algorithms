package com.nicky.tries;

public class Main {
    public static void main(String [] args){
        Trie trie = new Trie();
        trie.insertUsingHashTable("car");
        trie.insertUsingHashTable("care");

        //trie.traverse();
        trie.remove(null);
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("car"));
    }
}
