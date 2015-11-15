/* Speed limit problem on open.kattis.com 
https://open.kattis.com/problems/speedlimit
Problem topic: I/O and basic looping
implementation: read until EOF but need a clause for -1 (Could be improved)


Solution by: Kent Wong
Original problem credit: 
Author: John Cigas. Source: 2004 ACM ICPC Mid-Central North American Regional Contest

*/


import java.util.*;
public class speedlimit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int totaldistance = 0; // intialize 
    int prevHour = 0;      // intialize 
    int tc = 0;            // intialize 


      while (sc.hasNextInt()) { // read until EOF
        
          if (tc == 0) {        // if a Test Case is 0 then
          tc = sc.nextInt();    // we need to grab a new TC
            if (tc == -1) {     // likewise if the TC given is -1, break and end
              break;
              }
          }
        int mph = sc.nextInt();  // find mph 
        int hour = sc.nextInt(); // find hour input
        totaldistance = totaldistance + (mph * (hour - prevHour));
        prevHour= hour;          // calc for previous 
        tc--;                    // test case counter
        
        if (tc == 0) {
          System.out.println(totaldistance + " miles");
          totaldistance = 0;
          prevHour = 0;
        }

      }

  }
}
