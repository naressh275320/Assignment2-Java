//2) Write a Java program to find the index of an array element.

import java.util.Scanner;
public class ArrIndex_Q2{
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int ele, ind = -1;
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }
        
        //Taking input for the element to be searched in the array
        System.out.print("Enter the element to be searched in the array: ");
        ele = s.nextInt();

        //Traversing the array to find the element
        for(int i=0; i<n; i++){
            if(arr[i] == ele){
                ind = i;
            }
        }

        //Displaying the index of the array element where it's located
        if (ind == -1) {
            System.out.println("The element not found in the array");
        }
        else{
            System.out.println("The element " + ele + " found in the index - " + ind);
        }
    }
    
}
