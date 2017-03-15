import java.util.*;
public class Quiz2Redux{
  /*Returns an ArrayList<String> that contains all subsets of the
   *characters of String s. Assume s has no duplicate characters.
   *the characters should appear in the same order that they occur
   *in the original string.
   */
  public static ArrayList<String> combinations(String s){
      ArrayList<String>words = new ArrayList<String>();
      words.add("");
      help(words,s,0);
      Collections.sort(words);
      return words;
  }

  private static void help( ArrayList<String> words, String s, int index){
    if(s.length() == index){return;}
    for (int x =0; x < s.length(); x++){
        int siz = words.size();
        for (int y =0; y <siz; y++){
        words.add(words.get(y) + s.charAt(x));
        }
      }
  }

  public static void main(String args[]){
    System.out.println(combinations("ABCD"));
        System.out.println(combinations("AB"));
            System.out.println(combinations(""));
                System.out.println(combinations("ABC"));
  }
}

                             /*fill this in with more arguments*/
   /*METHOD TO BE WRITTEN BY YOU.*/
