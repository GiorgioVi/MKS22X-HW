
public class Recursion{

  public static double sqrt(double n){
    if(closeEnough(n, sqrt2(n, n/2))) return sqrt2(n, n/2);
    else{
      return sqrt(sqrt2(n, n/2));
    }
  }
  public static double sqrt2(double n, double guess){
    double betterGuess = ((n / guess) + guess) / 2;
    return betterGuess;
  }
  public static boolean closeEnough(double a, double b){
    return (Math.abs(a - b) < .00000001);
  }
  public static String name(){
    return "Vidali, Giorgio";
  }

public static void main(String[] args) {

}

}
