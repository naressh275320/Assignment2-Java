//1)	Write a Java program to sum the values of an array and the average value of array elements.

import java.util.Scanner;
public class SumAvgArr_Q1{
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the lenght of the array: ");
        //Taking input for the length of the array
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int sum = 0, avg = 0;
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }
        
        //Traversing the array to sum each elements
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        //Calculating the average of the array elements
        avg = sum/n;

        //Displaying the calculated sum and average of the array elements
        System.out.println("Sum of the Array elements: "+sum);
        System.out.println("Average of the Array elements: "+avg);
    }
    
}
