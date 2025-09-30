import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /*Scanner scan = new Scanner(System.in);
    System.out.println("Give two words");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();

    System.out.println("Give a Number");
    int N = scan.nextInt();

    lastFirstN(word1, word2, N);*/

    /*stringManip("kello","alphred");*/

    System.out.println(removeStr("bbbbbbadboom", "adc"));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    //substring(0,1) - 1st letter
    //substring(0,2) - 1st 2 letters
    //substring(0,3) - 1st 3 letters
    //...
    //susbtring(0,n) - 1st n letters
    firstN = s2.substring(0,n);
    //last n characters of s1
    //start at index length() - n gives the last n characters
    lastN = s1.substring(s1.length()-n);//length minus how many letters u want is where you want to start


    output = lastN + firstN;
    System.out.println(output);

  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String upper;
    String firstLetter;
    String restOfLetter;
    

    upper = s1.toUpperCase();
    firstLetter = s2.substring(0,1);
    restOfLetter = s2.substring(1);

    firstLetter = firstLetter.toUpperCase();
    restOfLetter = restOfLetter.toLowerCase();

    String secondString = firstLetter + restOfLetter; 
    System.out.println(upper);
    System.out.println(secondString);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {

    /*int firstOfAda = s1.indexOf(s2);//6
    String firstPart = s1.substring(0,firstOfAda);
    String lastLetterOfAda = s2.substring(s2.length()-1); //last a
    int endOfAda = s1.indexOf(lastLetterOfAda);
    String lastPart = s1.substring(endOfAda+1);

    String output = firstPart + lastPart;*/

    String output;
    String before;
    String after;

    int indexOfs2 = s1.indexOf(s2);
    int indexOfEnds2 = indexOfs2 + s2.length();

    before = s1.substring(0, indexOfs2);
    after = s1.substring(indexOfEnds2);

    output = before + after;
    return output;
  }
}
