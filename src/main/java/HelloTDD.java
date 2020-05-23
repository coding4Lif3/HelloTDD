import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class HelloTDD {

        public static void main(String[] args) {

            ResourceBundle rb = ResourceBundle.getBundle("config");

            System.out.println("Hello, World! " + rb.getString("name"));
            String helloString = sayHelloWithName("Federico");
        }

        public static String sayHelloWithName(String myName) {
            return "Hello " + myName;
        }

}
