public class HelloTDD {

        public static void main(String[] args) {

            System.out.println("Hello, World!");
            sayHelloWithName("Federico");
        }

        public static String sayHelloWithName(String myName) {
            return "Hello " + myName;
        }

}
