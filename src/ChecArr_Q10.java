//10) Write a Java program to check if an array of integers is without 0 and -1

import java.util.Scanner;
public class ChecArr_Q10 {
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        int c = 1, d = 1;

        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }

        //Traversing the array to find whether 0 and -1 is there
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                c = -1;
            }
            if(arr[i] == -1){
                d = -1;
            }
        }

        //Displaying the statement with the condition of flag variable
        if(c == -1){
            System.out.println("The array is with 0");
        }
        if(d == -1){
            System.out.println("The array is with -1");
        }
        if(c == 1){
            System.out.println("The array is without 0");
        }
        if(d == 1){
            System.out.println("The array is without -1");
        }
    }
    
}
