import java.util.*;

public class Contains
{
    public static boolean contains(String haystack, String needle)
    {
        if(haystack.contains(needle))
        {
            System.out.println("Yes! "+needle+" was found within "+haystack);
            return true;
        }
        else
        {
            System.out.println("No. "+needle+" was not found within "+haystack);
            return false;
        }
    }
    public static void main(String[] args)
    {
        contains("Java Programming", "ming");
        contains("Java Programming","grammy");
    }
}