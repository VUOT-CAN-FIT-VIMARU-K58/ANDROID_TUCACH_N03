package com.example.test_tucach_n05;

import android.graphics.Color;

import java.util.Random;

public class TienIch {
    public static int []M;
    public static int []G;
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static int getRandomARGB(int aThreshold){
        Random random = new Random();
        int alpha = random.nextInt(255);
        alpha = (alpha>aThreshold)? alpha : aThreshold;
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        return Color.argb(alpha, red, green, blue);
    }

    public static int[] Intersect(int []S){
        M = new int [101];
        G = new int [101];
        int dem = 0;
        for(int i=0;i<101;i++){
            M[i] = getRandomARGB(30);
        }
        sortASC(M);
        sortASC(S);
        for(int i=0;i<101;i++){
            if(M[i] == S[i]){
                G[dem] = M[i];
                dem ++;
            }
        }
    return G;
    }

    public static boolean InClass(int N,int[]S){
        for(int i =0;i<101;i++){
            if(S[i] == N){
                return true;
            }
        }
        return false;
    }



}
