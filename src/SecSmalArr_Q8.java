//8) Write a Java program to find the second smallest element in an array.

import java.util.Scanner;
public class SecSmalArr_Q8 {
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int min1 = 1000, min2 = 999;
         
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }

        //Traversing the array to find the smallest element
        for(int i=0; i<n; i++){
            if(arr[i] < min1){
            min1 = arr[i];
            }
        }

        //Traversing the array to find the second smallest element
        for (int i = 0; i < n; i++) { 
            if (arr[i] < min2 && arr[i] > min1) { 
                min2 = arr[i]; 
            } 
        }
        System.out.println("Second smallest element in the array: " +min2);

    }
}