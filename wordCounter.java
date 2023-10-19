import java.util.*;
public class wordCounter
{
 public static void main(String args[])
 {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String input = scanner.nextLine();

    String[] words = input.split(" ");

    //Count the number of words
    int wordCount = words.length;

    System.out.println("Word count:" + wordCount);
    scanner.close();
 }
}