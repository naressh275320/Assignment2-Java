//9) Write a Java program to find a missing number in an array.

import java.util.Arrays;
import java.util.Scanner;
public class MissEleArr_Q9{
    public static void main(String[] args){

        //Scanner definition
        Scanner s = new Scanner(System.in);

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

        //Sorting the array
        Arrays.sort(arr);
        int ele = arr[n-1]+1;

        //Checking the missing the lement by traversing the array till n-1
        for(int i=0; i<n-1; i++){
            if(arr[i+1] != arr[i]+1){
                ele = arr[i]+1;
            }
            
        }
        
        //Displaying the missing array element
      	System.out.println("The missing number is : "+ ele);
    }
}