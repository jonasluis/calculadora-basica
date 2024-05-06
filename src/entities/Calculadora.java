package entities;

import java.util.Scanner;

public class Calculadora {

    private Double num1;
    private Double num2;
    private String operacao;
    private Double resultado;

    public Calculadora() {
    }

    public Calculadora(double num1, double num2, String operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public double CalcularOperacao(){
        switch (operacao){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;

            default:
                throw new IllegalArgumentException("Operação inválida!");

        }
        return resultado;
    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operacao? (S ou N): ");
        return !sc.nextLine().toUpperCase().equals("N");

    }

}
