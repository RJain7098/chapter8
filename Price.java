

/**
 * Write a description of class Price here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Price
{
    public static void main(String[] args)
    {
        int[] bills = {100, 50, 20, 5, 1};
        ArrayList<String> waysf = new ArrayList<>(); 
        int ways = 0;
        
        System.out.println(partition(5, bills, 0));
    }
    
    
    public static int partition(int price, int[] bills, int start)
    {
        if (price == 0)
        {
            return 1;
        }
        int ways = 0;
        for (int i = start; i < bills.length; i++)
        {
            if (price >= bills[i])
            {
                ways += partition(price - bills[i], bills, i);
            }
        }
        return ways;
    }
    
    public static void addWay(String way, ArrayList ways)
    {
        ways.add(way);
    }
}
