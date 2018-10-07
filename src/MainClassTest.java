import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void testGetClassString()
    {
        String a = getClassString();
            if (a.isEmpty())
        {
            Assert.fail("The string is empty");
        } else if (a.contains("Hello")||a.contains("hello"))
        {
            System.out.println("Good sentence");
        }
    }

}

