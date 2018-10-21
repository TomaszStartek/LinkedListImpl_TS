package com.sda.git;

public class CustomLinkedList implements CustomList {


    private int size;
    private Node head;

    public CustomLinkedList(){

    }
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public int size() {
        return 0;
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
