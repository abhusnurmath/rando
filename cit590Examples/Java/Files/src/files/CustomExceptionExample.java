package files;

public class CustomExceptionExample
{
    public static void main (String args [ ])
    {
        try
        {
            int x = 10;

            if (x < 20 || x >100) throw new NumberRangeException("Please enter a number between 20 and 100");
        } 
        catch (NumberRangeException e)
        {
            System.out.println (e.getMessage());
        }
    }
}