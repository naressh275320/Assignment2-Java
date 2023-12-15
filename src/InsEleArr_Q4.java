//4) Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;
public class InsEleArr_Q4{
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int ele, ind = -1, c = 1;
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }
        
        //Taking input of the element which has to be inserted into the array
        System.out.print("Enter the element to be inserted in the array: ");
        ele = s.nextInt();

        //Taking input of the index where the element has to be inserted in the array
        System.out.print("Enter the index where element to be inserted in the array: ");
        ind = s.nextInt();

        if(ind > n || ind < 0){
            System.out.println("Out of index");
            c = -1;
        }
        
        if(c == 1){
            //Declaring new array and copies the element of old array from zeroth index to the index where insertion should happen
            int arr2[] = new int[n+1];
            for(int i=0; i<ind; i++){
            arr2[i] = arr[i];
            }

            //Inserting the element at the index position as the input given
            arr2[ind] = ele;

            //Copying the rest of array elements from old array after the index posiiton
            for(int i=ind; i<n; i++){
                arr2[i+1] = arr[i];
            }

            //Incrementing the lenght of the array 
            n++;

            //Displaying the modified array after the insertion process
            System.out.print("The updated array after inserting the element: ");
            for(int i=0; i<n; i++){
                System.out.print(arr2[i]+ " ");
            }
        }
        else{
            System.out.println("Index is out of bound. Cannot insert in that index position");
        }
        
    }
    
}
