package wight.hight;

import java.util.Scanner;

public class WightHight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double wight, hight, BMI;
        System.out.println("please Enter wight in kilogram");
        wight = input.nextDouble();
        System.out.println("please Enter hight in meter");
        hight = input.nextDouble();
        BMI = wight / (hight * hight);
        
        if (BMI < 25) {

            System.out.println("Interpretation:Underwight");

        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Interpretation:Normal");
        } else if (BMI >= 35 && BMI < 40) {
            System.out.println("Interpretation:overwight");

        } else {
            System.out.println("Interpretation:obese");
        }
    }

}
