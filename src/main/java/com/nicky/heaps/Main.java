package com.nicky.heaps;

public class Main {
    public static void main(String [] args){
        var heap = new Heap();

        heap.insert(10);
        heap.insert(2);
        heap.insert(3);
        heap.insert(14);
        heap.insert(15);
        System.out.println(heap.remove());
        System.out.println(heap.remove());

        System.out.println("Done");
    }
}
