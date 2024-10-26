package com.example.appfaztudo.model;

public class Util {

    public static double calculaIMC(double peso, double altura){
        return peso / (altura * altura);
    }

    public static double converterCelsiusParaKelvin(double valor){
        return valor + 273.15;
    }

    public static double converterCelsiusParaFahrenheit(double valor){
        return valor * 1.8 + 32;
    }

}
