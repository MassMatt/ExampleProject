
public class MyApplication {

    public MyApplication(){
        printHelloWorld();
        doMath(4,3);
    }

    private void printHelloWorld () {
        System.out.println("Hello World");
    }

    private void doMath (int number1, int number2) {
        System.out.println(number1 + number2);
    }


}
