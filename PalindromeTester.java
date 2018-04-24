

/**
 * Write a description of class PalindromeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PalindromeTester
{
    public static void main(String[] args)
    {
        System.out.println(test("racecar"));
    }
    
    public static boolean test(String word)
    {
        if (word.equals(reverse(word)))
            return true;
        else
            return false;
    }
    
    public static String reverse(String word)
    {
        if ((word == null) || (word.length() <= 1))
            return word;            
        
        return reverse(word.substring(1)) + word.charAt(0);
    }

}
