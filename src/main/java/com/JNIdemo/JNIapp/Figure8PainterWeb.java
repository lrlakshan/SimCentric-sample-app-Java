/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp;

/**
 *
 * @author Lakshan-Home
 */
public class Figure8PainterWeb {
    
    private double x;
    private double y;
    private double velocity = 0.005;
    private double rad = 0;
    private double coordsArray[][];

    //setting x value
    public void setX(double x) {
        this.x = x;
    }
    
    //setting y value
    public void setY(double y) {
        this.y = y;
    }
    
    //setting 2d array of coordinates
    public void setArray(double[][] coordsArray) {
        this.coordsArray = coordsArray;
    }

    //getting 2d array of coordinates
    public double[][] getArray() {
        return coordsArray;
    }
    
        public void run() {

        int i = 0;
        while (true) {
            double oldRad = rad;
            coordsArray = newCoordsArray(i, coordsArray, x, y);
            Figure8Move();
            if (Math.sin(oldRad) < 0 && Math.sin(rad) > 0) {
                break;
            }
            i++;
        }
    }

    public static double[][] newCoordsArray(int n, double arr[][], double x, double y) {

        // create a new array of size n+1 
        double newArray[][] = new double[n + 1][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                newArray[i][j] = arr[i][j];
            }
        }

        newArray[n][0] = x;
        newArray[n][1] = y;

        return newArray;
    }

    private native void Figure8Move();
}
