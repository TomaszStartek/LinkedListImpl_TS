package com.sda.git;

interface CustomList<E> {
    public E get(int index);
    public void add(E e);
    public int size();
}
