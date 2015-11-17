import java.util.* ;

public class mixedfractions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numerator;
    int denominator;
    double whole;
    int newNumer;

    while(sc.hasNextInt()) {

      numerator = sc.nextInt();
      denominator = sc.nextInt();

      if ((numerator == 0) && (denominator == 0)) {
        break;
      }

      newNumer = (numerator % denominator);
      whole = (numerator / denominator);
      System.out.println( (int)whole+" "+newNumer+" "+"/"+" "+denominator );

    }

  }
}
