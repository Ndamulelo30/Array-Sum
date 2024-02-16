/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysum;

/**
 *
 * @author Sanele
 */
public class App {

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = calculateSum(arr);
        System.out.println("The sum of the array elements is: " + sum);
    }
    public static int calculateSum(int[] arr){
     int sum = 0;
     for(int num : arr){
         sum += num;
     }
     return sum;
    }
}
