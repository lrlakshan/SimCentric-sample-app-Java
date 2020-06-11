/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp;

import java.io.*;
import java.lang.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Lakshan-Home
 */
public class Test {

//    Test(){
//        testMehtod();
//    }
    private String name = "Lakeee";
    private int num;
    private double x = 300;
    private double y = 400;
    private double velocity = 0.005;
    private double rad = 0;
    private double arr[][];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

//    public void setArr(double[][] arr) {
//        this.arr = arr;
//    }

    public double[][] getArr() {
        return arr;
    }

    public void run() {

//        testMehtod();
//        int[] numbers = {22, 33, 33};
//        double[] results = new Test().sumAndAverage(numbers);
//        System.out.println("In Java, the sum is " + results[0]);
//        System.out.println("In Java, the average is " + results[1]);
//        int x = 50;
        // call the method to add x in arr 
//        for (int i = 0; i < 1555; i++) {
////            for (int j = 0; j < 2; j++) {
//            arr = addX(i, arr, x, y);
//            testMehtod();
//            System.out.println("x : " + Math.sin(rad));
//            System.out.println("y : " + Math.cos(rad));
////            }
//        }
        int i = 0;
        while (true) {
            double oldRad = rad;
            arr = addX(i, arr, x, y);
            testMehtod();
            System.out.println("x : " + Math.sin(rad));
            System.out.println("y : " + Math.cos(rad));
            if (Math.sin(oldRad) < 0 && Math.sin(rad) > 0) {
                break;
            }
            i++;
        }
    }

    public static double[][] addX(int n, double arr[][], double x, double y) {
//        int i;

        // create a new array of size n+1 
        double newarr[][] = new double[n + 1][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                newarr[i][j] = arr[i][j];
            }
        }

        newarr[n][0] = x;
        newarr[n][1] = y;

        return newarr;
    }

    private native void testMehtod();

    private native double[] sumAndAverage(int[] numbers);
}
