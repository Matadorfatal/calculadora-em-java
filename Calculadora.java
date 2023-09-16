package com.software;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    System.exit(1);
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Erro: Operação inválida.");
                System.exit(1);
        }
        System.out.println("Resultado: " + resultado);
    }
}
