package package1;

import javax.swing.*;
import java.util.*;
/**
 * Created by aneesh on 16/11/16.
 */
public class classadd {
    public static void main(String[] args) {
        int a,b,c;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the values of a and b");
        a = reader.nextInt();
        b = reader.nextInt();
        c=a+b;
        System.out.println("the sum of " + a +" and " + b + " is " + c);

    }
}
