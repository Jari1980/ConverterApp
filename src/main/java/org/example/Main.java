package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        var scan = new Scanner(System.in);
        while(true){
        System.out.println("Currency Converter App:\n" +
                "1. Convert SEK to USD\n" +
                "2. Convert USD to SEK\n" +
                "3. Convert SEK to EURO\n" +
                "4. Convert Euro to SEK\n" +
                "0. Exit\n" +
                "Enter your choice");
        String option = scan.nextLine();
        try{
            int optionNum = Integer.parseInt(option);
            switch(optionNum){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 0:
                    System.out.println("Closing program");
                    System.exit(0);
                default:
                    System.out.println("Not a valid option, choose again.");
                    break;
            }
        }
        catch (Exception e){
            System.out.println("Not a valid number, choose again.");
            }
        }
    }
}