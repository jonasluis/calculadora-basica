import  java.util.Scanner;
import  java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        try {
            do {

                System.out.println("Digite o valor um: ");
                valorUm = scanner.nextDouble();

                System.out.println("Digite a operacao( +, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valorDois = scanner.nextDouble();

                System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

                continuar = verificarNovaOperacao();
            }while (continuar);
        } catch (InputMismatchException ex){
            System.out.println("Os valores para calculo devem ser numericos =( ");
        }




    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operacao? (S ou N): ");
        return !sc.nextLine().toUpperCase().equals("N");

    }
    public  static  Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;

        switch (operacao){
            case "+":
               respostaCalculo = valorUm + valorDois;
               break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;

            default:
                System.out.println("Operacao e invalida =(");
        }
        return  respostaCalculo;
    }
}