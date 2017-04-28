import java.util.Stack;

public class StackCalc{


public static double eval(String s){
  String[] vals = s.split(" ");
  Stack<String> values = new Stack<String>();
      for(String v : vals){
        if(isOp(v)){
         	 values.push(apply(v,values.pop(),values.pop()));
        }
        else{
          values.push(v);
        }
      }

      return Double.parseDouble(values.pop());
  }


  private static boolean isOp(String s){
    return
     s.equals("+") ||
     s.equals("-") ||
     s.equals("*") ||
     s.equals("/") ||
     s.equals("%");
  }
private static String apply(String er, String a, String b){
 double A = Double.parseDouble(a);
 double B = Double.parseDouble(b);
 if(er.equals("-")){
           return (B - A) + "" ;
 }else if(er.equals("+")){
           return (B + A) + "";
 }else if(er.equals("/")){
           return (B / A) + "";
 }else if(er.equals("*")){
           return (B * A) + "";
 }else{
           return (B % A) + "";
   }
}
public static void main(String[] args)
{
    System.out.println(StackCalc.eval("10 2 +"));//12.0
    System.out.println(StackCalc.eval("10 2 -"));//8.0
    System.out.println(StackCalc.eval("10 2.0 +"));//12.0
    System.out.println(StackCalc.eval("11 3 - 4 + 2.5 *"));//30.0
    System.out.println(StackCalc.eval("8 2 + 99 9 - * 2 + 9 -"));//893.0
    System.out.println(StackCalc.eval("10 2 + 10 * 1 + 1 1 1 + + + 10 10 + -"));//104.0
}
}
