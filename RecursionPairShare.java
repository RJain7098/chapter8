

/**
 * Write a description of class RecursionPairShare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursionPairShare
{
    public static void main(String[] args)
    {
        printNumbers(5);
        printNumbersTwo(5);
        System.out.println(reverse("mitchell"));
        System.out.println(isPrime(1020, 1019));
        System.out.println(fibonacci(7));
    }
    
    
    public static int printNumbers(int num)
    {
       System.out.println(num);
       if (num == 0)
           return 0;
       else
           return printNumbers(num-1);
   }
    
    public static void printNumbersTwo(int num)
    {  
       if (num > 0)
       {
           printNumbersTwo(num);
       }
       System.out.println(num);
    }
    
    public static String reverse(String word)
    {
        if ((word == null) || (word.length() <= 1))
            return word;            
        
        return reverse(word.substring(1)) + word.charAt(0);
    }
    
    public static boolean isPrime(int n, int d)
    {
        if (d == 1)
        {
            return true;
        }
        else
        {
            if (n % d == 0)
            {
                return false;
            }
            else
            {
                return isPrime(n, d-1);
            }
        }
    }

    public static int fibonacci(int n)
    {
        if (n == 2)
            return fibonacci(n-1);
        else if (n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }



}

