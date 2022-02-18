package com.nicky.heaps;

public class Heap {

    private int[] items = new int[10];
    private int size; //keeps track of number of items in the heap to be used during removal

    //insert
    public void insert(int value){
        if (isFull()){
            throw new IllegalStateException();
        }
        items[size++]=value; //we're adding elements to the next available slot.
        //now implement bubbling up
        //if newItem > parent, then bubble it up.
        bubbleUp();
    }

    //remove
    public int remove(){
        if (isEmpty()) throw new IllegalStateException();
        //move value of the last node to the first node
        var root = items[0];
        items[0]=items[--size];

        //execute bubble down operation ie. if item(root)<children then bubble down
        bubbleDown();
        return root;
    }

    private void bubbleDown(){
        var index = 0;
        while (index<=size && !isValidParent(index)){
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            //reset the index
            index=largerChildIndex;
        }
    }
    private int largerChildIndex(int index){
        if (!hasleftChild(index)) return index;
        if (!hasrightChild(index)) return leftChildIndex(index);
       return (leftChild(index) > rightChild(index)) ?
                leftChildIndex(index) : rightChildIndex(index);
    }

    //handle edge cases
    private boolean hasleftChild(int index){
        return leftChildIndex(index) <=size;
    }

    private boolean hasrightChild(int index){
        return rightChildIndex(index) <=size;
    }

    private boolean isValidParent(int index){
        if (!hasleftChild(index)) return true;
        if (!hasrightChild(index)) return items[index] >= leftChild(index);
        return items[index] >= leftChild(index) && items[index] >= rightChild(index);
    }

    private int leftChild(int index){
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index){
        return items[rightChildIndex(index)];
    }

    private int leftChildIndex(int index){
        return index*2+1;
    }

    private int rightChildIndex(int index){
        return index*2+2;
    }

    public boolean isFull(){
        return size == items.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    //bubble up method
    private void bubbleUp(){
        //index of the last item
        var index = size-1;
        //use while loop ie. as long as the item at index is
        // greater than parent then we bubble it up
        while (index > 0 && items[index] >items[parent(index)]){
            swap(index, parent(index));
            //now recalculate the index for the next iteration
            index=parent(index);
        }
    }
    //calculate index of parent
    private int parent(int index){
        return (index-1)/2;
    }

    //implement the swap method
    private void swap(int first, int second){
        var temp = items[first];
        items[first]=items[second];
        items[second]=temp;
    }
}
