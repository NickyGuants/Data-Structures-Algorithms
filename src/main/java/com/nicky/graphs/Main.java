package com.nicky.graphs;

public class Main {
    public static void main(String [] args){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.addEdge("B", "C");

        graph.removeNode("C");

        graph.print();
    }
}
