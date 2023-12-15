//6) Write a Java program to find duplicate values in an array of string values.

import java.util.Scanner;
public class DupliArr_Q6 {
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array of strings: ");
        int n = s.nextInt();

        String c = "null";
        //Declaration of array with the length 
        String arr[] = new String[n];
        
        //Taking input for array of strings
        for(int i=0;i<n;i++){
            System.out.print("Enter the element for array of strings: ");
            arr[i] = s.next();
        }

        //Searching for duplicate value with multiple for loops
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    c = arr[i];
                    break;
                }
            }
        }
        System.out.println("Duplicate values: "+c);
    }
}

