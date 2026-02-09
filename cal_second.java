// question 2- give an integer array of size n ,in one sec you can increase the value of 1 element by 1,-
// find the minimum time in sec to make all the element of the array equal...

// observation - to minimize time make all elements equal to the maximum element of the array

// pseudo code :
//  step 1 - find the maximum element in the array 
//  step 2 -for every element calculate how much its need to be increase  to reach the maximum
//  step 3- sum all those all differences
public class cal_second {

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int i ;
        int max = a[0];
        int time = 0;
        // find the maximum element 
        for( i = 0 ; i< a.length;i++ ) {
            if(a[i]> max){
            max= a[i];
            }
        // calculate the total time
        }
        for(i = 0 ; i< a.length;i++ ){
            time = time + (max - a[i]);
        }
        System.out.print(time);
    }
    
}

