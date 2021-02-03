package com.br.zup;

public class Main {

    public static void main(String[] args) {

        IO entradaESaida = new IO();
        Conversor conversor = new Conversor();
        conversor.celsius = entradaESaida.pedirUmDado("Digite a temperatura em Celsius").nextInt();

        entradaESaida.saidaDeDados("A temperatura em Fahrenheit é "+conversor.paraFahrenheit());
        entradaESaida.saidaDeDados("A temperatura em Kelvin é "+conversor.paraKelvin());
        entradaESaida.saidaDeDados("A temperatura em Rankine é "+conversor.paraRankine());
        entradaESaida.saidaDeDados("A temperatura em Réuaumur é "+conversor.paraRéaumur());






    }
}
