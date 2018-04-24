

/**
 * Write a description of class Fundraising here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundraising
{
    static int count = 0;
    
    public static void main(String[] args)
    {
        System.out.println(collect(1000));
        
        System.out.println(count);
    }
    
    public static int collect(int goal)
    {
        count++;
        if (goal <= 1)
            return 1;
        else
        {
            
           
            return 1 + collect(goal/10) + collect(goal/10) + collect(goal/10) + collect(goal/10)
            + collect(goal/10) + collect(goal/10) + collect(goal/10) + collect(goal/10) + collect(goal/10) 
            + collect(goal/10);
            
           
           
           
            
        }
    }
}
