package com.company;

import java.util.*;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index, T value){
        data[index] = value;
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(15);
        System.out.println(list);
    }
}
