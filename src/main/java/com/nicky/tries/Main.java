package com.nicky.tries;

public class Main {
    public static void main(String [] args){
        Trie trie = new Trie();
        trie.insertUsingHashTable("car");
        trie.insertUsingHashTable("card");
        trie.insertUsingHashTable("care");
        trie.insertUsingHashTable("careful");
        trie.insertUsingHashTable("egg");

        //trie.traverse();
//        trie.remove(null);
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("car"));

        var words = trie.findWords("car");
        System.out.println(words);
    }
}
