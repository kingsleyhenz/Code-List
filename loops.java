package basic;

import java.util.Scanner;

public class loops {
    Scanner scan = new Scanner(System.in);
    public int sumOfNumber(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }

//         while loop

    public void sumNumberWithoutZeroInput(){
        int sum = 0;
        System.out.println("Enter any number \n 0 to terminate");
        int num = scan.nextInt();
        while (num != 0){
            sum += num;
            num = scan.nextInt();
        }
        System.out.println("Sum = "+ sum);
    }}

    //do while loop
//
//    public void options(){
//        int option;
//        do{
//            System.out.println("Kindly select from the option below");
//            System.out.println(">>1: for loop  <<");
//            System.out.println(">>2: while loop <<");
//            System.out.println(">>3: exit <<");
//            option = scan.nextInt();
//            switch (option){
//                case 1:
//                    System.out.println("Enter number to sum");
//                    int num = scan.nextInt();
//                    sumOfNumber(num);
//                    break;
//                case 2:
//                    sumNumberWithoutZeroInput();
//                    break;
//                case 3:
//                    System.exit(0);
//                    break;
//        }
//    }
//}
