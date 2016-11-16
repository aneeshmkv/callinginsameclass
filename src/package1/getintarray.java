package package1;

import javax.swing.*;
        import java.util.*;
public class getintarray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Scanner array = new Scanner(System.in);
        System.out.println("enter the limit ");
        int n= array.nextInt();
        System.out.println("enter the array");
        for (int i=0;i<n;i++){
            numbers[i]=array.nextInt();
        }
        System.out.println("array of integer is" );
        for (int i=0;i<n;i++){

            System.out.println(numbers[i]);
        }

    }
}