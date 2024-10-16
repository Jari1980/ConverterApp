package org.example;

public class Converter {
    public static double sekToUsd(double amount){
        return (amount * Rate.sekToUsd);
    }
    public static double sekToEuro(double amount){
        return (amount * Rate.sekToEuro);
    }
    public static double euroToSek(double amount){
        return amount * Rate.euroToSek;
    }
    public static double usdToSek(double amount){
        return amount * Rate.usdToSek;
    }
}
