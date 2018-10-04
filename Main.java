package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = 0 + (int)(Math.random() * 100);
            System.out.print(arr[i] + "   ");
        }
        int t = 0;
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j ++){
                if (arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + "   ");
        }
    }
}
