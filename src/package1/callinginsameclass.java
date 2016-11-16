package package1;

/**
 * Created by aneesh on 16/11/16.
 */
public class callinginsameclass {
    public static void main(String[] args) {

        printOne();
        printTwo();
    }

    public static void printOne() {
        System.out.println("Hello World");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }

}
