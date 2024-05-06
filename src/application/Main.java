package application;

import entities.Calculadora;

import java.util.Locale;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        do {
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        calculadora.setNum1(num1);
        calculadora.setNum2(num2);
        calculadora.setOperacao(String.valueOf(operacao));  // Convert char to String
        double resultado = calculadora.CalcularOperacao();
        System.out.println("Resultado: " + resultado);

        }while (calculadora.verificarNovaOperacao());

        double resultado = calculadora.CalcularOperacao();
        System.out.println("Resultado: " + resultado);



    }


}