package com.OOPs.Interfaces;

public class Dog implements PrintInterface {

    public static<T extends PrintInterface> void printArray(T[] a){
        for (int i = 0; i < a.length; i++) {
            a[i].print();
            System.out.println(" ");
        }
        System.out.println();
    }

    @Override
    public void print() {
        //TODO
    }
}
