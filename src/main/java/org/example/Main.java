package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        double amount;
        double amountExhanged;
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
                    amount = amount();
                    amountExhanged = Converter.sekToUsd(amount);
                    System.out.println("You will receive " + amount + "USD");
                    break;
                case 2:
                    amount = amount();
                    amountExhanged = Converter.usdToSek(amount);
                    System.out.println("You will receive " + amount + "SEK");
                    break;
                case 3:
                    amount = amount();
                    amountExhanged = Converter.sekToEuro(amount);
                    System.out.println("You will receive " + amount + "Euro");
                    break;
                case 4:
                    amount = amount();
                    amountExhanged = Converter.euroToSek(amount);
                    System.out.println("You will receive " + amount + "SEK");
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

    public static double amount(){
        var scan = new Scanner(System.in);
        double exh;
        while(true){
            System.out.println("Exhange amount? :");
            String amount = scan.nextLine();
            try{
                exh = Double.parseDouble(amount);
                break;
            }
            catch (Exception e){
                System.out.println("Not a valid number.");
            }
        }
        return exh;
    }

}