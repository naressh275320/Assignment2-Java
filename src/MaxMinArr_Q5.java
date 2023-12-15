//5) Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;
public class MaxMinArr_Q5{
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int max = 0, min = 99;
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }

        //Traversing the array to find the element
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        //Displaying the modified array after the insertion process
        System.out.println("The maximum value element in the given array: "+max);
        System.out.println("The minimum value element in the given array: "+min);
    }
    
}
