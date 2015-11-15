/*
spavanac problem
time limit: 1.0 second
https://open.kattis.com/problems/spavanac
*/
import java.util.*;
public class spavanac {
  public static void main(String[] args){ // notice the case sensitivity here
    Scanner sc = new Scanner(System.in); // case sensitive
    int hour = sc.nextInt();
    int minute = sc.nextInt();
    int newMinute;
    int newHour;

    if (minute < 45) {
      hour--;
        if (hour < 0) {
          hour = 23;
        }
      newMinute = (minute - 45) + 60;
      newHour = hour;
    }
    else {
      newMinute = (minute - 45);
      newHour = hour;
    }

    System.out.println(""+ newHour + " " + newMinute); // print in "HH MM" format
  }
}
