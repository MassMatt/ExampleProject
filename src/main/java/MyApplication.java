import java.util.Random;

public class MyApplication {

    public MyApplication() {


    }

    public String printHelloWorld() {
        return "Hello World";
    }

    public int doMath(int number1, int number2) {
        int result = number1 + number2 * 100;
        System.out.println(result);
        return result;
    }

    public int rdn(int max) {

        Random rand = new Random();

        int n = rand.nextInt(max) + 1;

        return n;
    }

}
