/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_orientada_objetos;
import java.util.Scanner;
/**
 *
 * @author kaua.1880
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadoracientifica cc = new calculadoracientifica();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        float num2 = scanner.nextFloat();
        
        float soma = calculadora.somar(num1, num2);
        float sub  = calculadora.subtrair(num1, num2);
        float mult = calculadora.multiplicar(num1, num2);
        float div  = calculadora.dividir(num1, num2);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        System.out.println("-----------------------------------------------");
        System.out.println("Agora, informe um número para saber a raiz quadrada: ");
        Double numRq = scanner.nextDouble();
        Double rq  = cc.raizQuadrada(numRq);
        System.out.println("Raiz quadrada de " + numRq + " é: " + rq);
        System.out.println("-----------------------------------------------");
        System.out.println("Informe um número: ");
        Double num = scanner.nextDouble();
        System.out.println("Informe uma potência: ");
        Double numPot = scanner.nextDouble();
        Double pow = cc.potencia(num, numPot);
        System.out.println(num + " elevado a " + numPot + " é: " + pow);
        
      System.out.println("Deseja calcular a média ponderada? (S/N): ");
        String escolha = scanner.next();
        
        if (escolha.equalsIgnoreCase("S")) {
            System.out.println("Informe o primeiro valor: ");
            float valor1 = scanner.nextFloat();

            System.out.println("Informe o segundo valor: ");
            float valor2 = scanner.nextFloat();

        System.out.println("Informe o peso 1: ");
            float peso1 = scanner.nextFloat();    
            
            System.out.println("Informe o peso 2: ");
            float peso2 = scanner.nextFloat();
            
           
            Media_ponderada mediaCalculator = new Media_ponderada();
            float resultadoMedia = mediaCalculator.media(valor1, valor2, peso1,peso2);
            System.out.println("A média ponderada dos valores é: " + resultadoMedia);
        
        }
        System.out.println("Quantos números você deseja calcular a média aritmética? ");
        int quantidadeNumeros = scanner.nextInt();

        double somaAritmetica = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Informe o próximo número: ");
            double numeroAritmetica = scanner.nextDouble();
            somaAritmetica += numeroAritmetica;
        }

        
        double mediaAritmetica = somaAritmetica / quantidadeNumeros;

        System.out.println("A média aritmética dos números é: " + mediaAritmetica);
    }
}
    