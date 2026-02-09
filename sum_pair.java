// Q- 5 given an array an elmentt , check if their exist a pair (i,j) such that array of i + array of j == k and i!=j
// Note - i and j are index value and k is the given sum 

// observation - create a nested loop iterate and check the pair equal to k
// pseudo code :
//  step 1 : create one outer loop and inner loop iterate array length
// step 2 : calclute the sum of two element is equal to the value of k
// step 3 : if pair found count +1 and after if else condition check the c value is equal to 0 print no else yes

public class sum_pair{
    public static void main(String args []){
        int k = 10;
        int c = 0;
        int a[] = {1,2,3,4,5,6,7,8};
        for(int i = 0 ; i<a.length; i++){
            for(int j = 0 ; j<a.length;j++){
                if (a[i]+ a[j] == k && i!= j){
                c = c+1;
                }
            }        
        }if (c==0){
            System.out.println("no");
        }else{
            System.out.println(" yes ");
        }

    }   
}