package com.OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {

        Dog[] d=new Dog[5];
        for (int i = 0; i <d.length ; i++) {
            d[i]=new Dog();
        }
        Dog.printArray(d);

    }
}
