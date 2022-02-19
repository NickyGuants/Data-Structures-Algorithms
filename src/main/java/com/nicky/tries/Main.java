package com.nicky.tries;

public class Main {
    public static void main(String [] args){
        Trie trie = new Trie();
        trie.insertUsingHashTable("cat");
        trie.insertUsingHashTable("can");

        System.out.println(trie.contains("canadn"));

        trie.traverse();
    }
}
