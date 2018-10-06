import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void testGetClassString()
    {
        String a = getClassString();
        String b = getClassStringHello();
        String c = getClassStringHhello();

        if (a.isEmpty())
        {
            Assert.fail("The string is empty");
        } else {
            System.out.println(a.regionMatches(true, 0, b, 0, 5));
            System.out.println(a.regionMatches(true, 0, c, 0, 5));
        }

    }
}
