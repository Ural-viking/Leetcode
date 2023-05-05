package TheLeetcodeBeginnersGuide;

import java.util.Scanner;

public class Task_2235 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print(sum(num1,num2));
    }
    public static int sum(int num1, int num2) {
        int result =  num1+num2;
        return result;
    }
}