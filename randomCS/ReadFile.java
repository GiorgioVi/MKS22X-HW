import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
  public static void main(String args[]) throws FileNotFoundException {
        //instead of a try/catch, you can throw the FileNotFoundException.
        File infile = new File("Mazel.txt");// can be a path"/full/path/to/file.txt" 
        Scanner inf = new Scanner(infile);
	String body = "";
        while(inf.hasNextLine()){
            String line = inf.nextLine();
            System.out.println(line);
        }       
    }   
}

