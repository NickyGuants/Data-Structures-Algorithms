package com.nicky.HashTables;

import java.util.LinkedList;

public class HashTable <K,V>{
    //step 1: create the entry class which will hold the key/value pair
    //The key and value should be of generic types
    private static class Entry<K,V>{
        private K key;
        private V value;
        //Create a constructor to initialize the key and value
        public Entry(K key,V value ){
            this.key=key;
            this.value=value;
        }
    }

    //use java Linkedlist to handle collisions
    //so we create an array of linkedlists
    int capacity = 10;
    private LinkedList<Entry<K,V>>[] entries = new LinkedList[capacity];

    //Create the put method to add a key/value pair to the hashtable.
    public void put(K key, V value){
        //hash the key to get the index
        var index = hash(key);

        //Check if the bucket at this index is null, if null add a new linked list at that index
        if (entries[index] == null){
            entries[index] = new LinkedList<>();
        }
        var bucket = entries[index];
        //otherwise check all the entries in this bucket, if a similar one is found, replace it.
        for (var entry: bucket){
            if (entry.key == key){
                entry.value = value;
                return;
            }
        }
        Entry<K, V> entry = new Entry<>(key, value);
        bucket.addLast(entry);
    }

    public V get(K key){
        if (key == null)
            return null;

        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(K key){
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            throw new IllegalStateException();

        for(var entry: bucket){
            if (entry.key==key){
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();    }

    //Hash function
    public int hash(K key){
        return Math.abs(key.hashCode() % capacity);
    }
}
