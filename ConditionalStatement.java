package basic;

import java.util.Scanner;

public class ConditionalStatement {
    Scanner input = new Scanner(System.in);

    public void oddEven(int num){
        if(num % 2 == 0)
            System.out.println(num + " is an integer");
        else
            System.out.println(num + "is an odd number");
        if(num > 0)
            System.out.println(num + "is positive");
            else if(num < 0)
                System.out.println(num + "is negative");
            else
                System.out.println(num + "is neither positive nor negative");
    }
    public String validVotersAge(int age){
        return age >=10? "You are mature enough to vote": "Oops! You are below required age";
    }
    public void output(int option){
        switch (option){
            case 1:
                System.out.println("Enter number and i will tell you if it is even or odd");
                int num = input.nextInt();
                oddEven(num);
            case 2:
                System.out.println("Enter your age: ");
                int age = input.nextInt();
                System.out.println(validVotersAge(age));
                break;
            case 3:
                System.out.println("Bye Bye");
                System.exit(0);
            default:
                System.out.println("Sorry wrong input entered");
        }
    }
    public void highestNum(int num1, int num2, int num3){
        if(num1 > num2 && num1 >num3)
            System.out.println(num1 + " is the highest");
        else if(num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the highest");
        else if(num3 > num1 && num3 > num2);
        System.out.println(num3 + " is the highest");
    }


    public void findX1(int a, int b, int c){
        int d = (b * b) - 4;
            double x1 = (-b - Math.sqrt(d * a * c)/ (2 * a));
            if(d > 0)
                System.out.println("x1 = "+ x1);
            else if(d == 0)
                System.out.println("x1 and x2 are the same");
            else if(d < 0)
                System.out.println("number is negative");
    }
    public void findX2(int a, int b, int c){
        int d = (b * b) - 4;
        double x2 = (-b + Math.sqrt(d * a * c)/ (2 * a));
        if(d > 0)
            System.out.println("x2 = "+ x2);
        else if(d == 0)
            System.out.println("x1 and x2 are the same");
        else if(d < 0)
            System.out.println("number is negative");
    }
}
