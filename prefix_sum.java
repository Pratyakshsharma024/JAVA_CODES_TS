// question 3 -Write a Java program to read 5 integers from the user and compute the prefix sum array.
// The prefix sum array should store at each index the sum of all elements from index 0 to that index.

// observation - Each element of the prefix sum array is the sum of the current element and the previous prefix sum.

// pseudo code :
// step 1 - make two array of n size and array1 element equals to the array2 
// step 2 - iterat and sum the current element and previous element one by one

import java.util.*;

public class prefix_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        int [] a = new int[5];
        int [] b = new int[5];
        System.out.println("enter 5 element");
        for ( i = 0; i<=4;i++){
            a[i] = sc.nextInt();
        // replace all the element of array1 to array2
        }
        for ( i = 0; i<=4 ;i++){
            b[i] = a[i];
            
    // calculate the prefix sum 
    }for ( i = 1; i<=4 ;i++){
        b[i] = a[i]+ b[i-1];
        // print the prefix element
    }for ( i = 0; i<=4 ;i++){
        System.out.println(b[i]);
    }
}
}
