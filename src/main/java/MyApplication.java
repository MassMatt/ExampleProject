import java.util.Random;

public class MyApplication {

    public MyApplication() {
        printHelloWorld();
        doMath(4, 3);

        int numberOfWeeks = 101;
        int tracker = 0;


        while (numberOfWeeks > 80) {

            int count = 0;
            while (rdn(14000000) != 1) {
                count++;
            }


            count = count / 2;

            numberOfWeeks = count / 52;

            tracker++;
            System.out.println(tracker + " : " + numberOfWeeks);
        }



    }

    private void printHelloWorld() {
        System.out.println("Hello World");
    }

    private void doMath(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private int rdn(int max) {

        Random rand = new Random();

        int n = rand.nextInt(max) + 1;

        return n;
    }

}
