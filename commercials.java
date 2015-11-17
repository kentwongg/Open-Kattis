/*
 *   Implements Kadane Algorithm (Dynamic programming problem, max sum of a sub-array)
 *   For Open-Kattis;  https://open.kattis.com/problems/commercials
 *   Buddy wants to maximize his commercial radio advertisments
 *   He can only stream them in a continous block
 *   Find the best bang for his/her buck (Classical Max Sum of a sub-sequence of a sequence)
 *   Complexity of Kadane's alg is O(n)
 */

import java.util.Scanner;

/* Class commercials */
public class commercials
{
    /* Function to largest continuous sum */
    public int findMaxSumSubSequence(int[] arr)

// this is Kadane's Algorithm
    {
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            /* calculate maxEndingHere */
            if (maxEndingHere < 0){
                maxEndingHere = arr[i];
            }else
                maxEndingHere += arr[i];

            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
    /* Main function */
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        /* Make an object of Kadane class */
        commercials sumObject = new commercials();
        int N = scan.nextInt(); // get N commercial breaks
        int P = scan.nextInt(); // get P price of one commercial break
        int[] arr = new int[N];

          for (int i = 0; i < N; i++) {
            arr[i] = (scan.nextInt()- P);
          }

        int sum = sumObject.findMaxSumSubSequence(arr);
        System.out.println(sum);
    }
}
