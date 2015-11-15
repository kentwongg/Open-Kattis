/*
conundrum
open.kattis.com/problems/conundrum
problem involves string manipulation
edit one string until it is a multiple of per

definition of multiple:  a | b  ; a is a divisor of b or b is a multiple of a
                        for b = ak, for some integer k;
                        length is to be assumed to be a Length  = 3 * K
 */


import java.util.*;
public class conundrum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create scanner object
    String inputString = sc.nextLine(); //grab the next line
    char cipherText[] = inputString.toCharArray(); // strings are inmutable in java, we must convert it into an array
    int j = 0; // counter to know which part of PER we are examining
    int day = 0;

    for (int i = 0; i < cipherText.length; i++) { //length has no arg

        if ((cipherText[i] != 'P') && (j == 0)) {
          cipherText[i] = 'P'; // since we are using a charArray, we must compare character literals. Double "" will define string literals. Cannot compare char to string!
          j++; // add to J since we did something
          day++; // this took a day
        } else if ( (cipherText[i] != 'E') && (j == 1 ) ){
          cipherText[i] = 'E';
          j++; //add to J since we did something
          day++; // this took a day
        } else if ( (cipherText[i] != 'R') && (j == 2) ){
          cipherText[i] = 'R';
          j = 0; //add to J since we did something
          day++; // this took a day
        } else {
          j++; // otherwise look onward for the next character in PER
            if (j>2) { // we need to ensure the counter is reset
              j = 0; // reset counter
            }
        }
    }
    System.out.println(day);
 }
}
