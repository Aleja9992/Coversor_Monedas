package com.conversor;

import java.io.IOException;
import java.util.Scanner;

public class RetoConversor {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);

        ConsultaAPI consulta = new ConsultaAPI();
        ConversorMoneda conversor = new ConversorMoneda();

        int opcion = 0;

        while(opcion != 7){

            System.out.println("""
            *************************************
            Sea bienvenido/a al Conversor de Moneda

            1) Dólar ==> Peso argentino
            2) Peso argentino ==> Dólar
            3) Dólar ==> Real brasileño
            4) Real brasileño ==> Dólar
            5) Dólar ==> Peso colombiano
            6) Peso colombiano ==> Dólar
            7) Salir
            *************************************
            Elija una opción válida:
            """);

            opcion = lectura.nextInt();

            if(opcion == 7){
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.println("Ingrese el valor que deseas convertir:");
            double valor = lectura.nextDouble();

            double resultado = 0;

            switch(opcion){

                case 1:
                    String json1 = consulta.buscarMoneda("USD");
                    double tasaARS = conversor.obtenerTasa(json1,"ARS");
                    resultado = valor * tasaARS;
                    System.out.println("Resultado: " + resultado + " ARS");
                    break;

                case 2:
                    String json2 = consulta.buscarMoneda("ARS");
                    double tasaUSD = conversor.obtenerTasa(json2,"USD");
                    resultado = valor * tasaUSD;
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                case 3:
                    String json3 = consulta.buscarMoneda("USD");
                    double tasaBRL = conversor.obtenerTasa(json3,"BRL");
                    resultado = valor * tasaBRL;
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                case 4:
                    String json4 = consulta.buscarMoneda("BRL");
                    double tasaUSD2 = conversor.obtenerTasa(json4,"USD");
                    resultado = valor * tasaUSD2;
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                case 5:
                    String json5 = consulta.buscarMoneda("USD");
                    double tasaCOP = conversor.obtenerTasa(json5,"COP");
                    resultado = valor * tasaCOP;
                    System.out.println("Resultado: " + resultado + " COP");
                    break;

                case 6:
                    String json6 = consulta.buscarMoneda("COP");
                    double tasaUSD3 = conversor.obtenerTasa(json6,"USD");
                    resultado = valor * tasaUSD3;
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}