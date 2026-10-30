package lesson3;
import java.util.Scanner;
public class activity {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your name");
        String str = sc.nextLine();
        System.out.print("please enter your age");
        Integer int1 = sc.nextInt();
        System.out.print("please enter a floating number");
        float float1 = sc.nextFloat();
        System.out.println(str);
        System.out.print(int1);
        System.out.print(float1);
    }
}
