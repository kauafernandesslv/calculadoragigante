/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_orientada_objetos;
import java.util.Scanner;
/**
 *
 * @author kaua.1880
 */
public class media_aritmetica {
    

public class MediaAritmetica extends Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números você deseja calcular a média? ");
        int quantidadeNumeros = scanner.nextInt();
        
        // Variável para armazenar a soma dos números
        double soma = 0;
        
        // Loop para ler os números e somá-los
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Informe o próximo número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        // Calcula a média aritmética
        double media = soma / quantidadeNumeros;
        
        System.out.println("A média aritmética dos números é: " + media);
    }
}
}
