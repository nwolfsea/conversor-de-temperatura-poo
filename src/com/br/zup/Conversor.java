package com.br.zup;

public class Conversor {

     double celsius;
     double f;
     double k;
     double re;
     double ra;

    public double paraFahrenheit() {
        double total = celsius * 1.8 + 32;
        return total;
    }

    public double paraKelvin() {
        double total = celsius + 273.15;
        return total;
    }

    public double paraRéaumur() {
        double total = celsius * 0.8;
        return total;
    }

    public double paraRankine() {
        double total = celsius * 1.8 + 32 + 459.67;
        return total;
    }
}
