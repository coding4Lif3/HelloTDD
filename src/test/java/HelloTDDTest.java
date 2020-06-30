import org.junit.Assert;
import org.junit.Test;

public class HelloTDDTest {

    @Test
    public void sayHelloWithNameTest() {
        Assert.assertEquals("Hello Fede", HelloTDD.sayHelloWithName("Fede"));
    }

}