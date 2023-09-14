/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_orientada_objetos;



/**
 *
 * @author kaua.1880
 */
public class Media_ponderada extends Calculadora {
    
    public float media(float a , float b , float peso1 , float peso2) {
        
        float resultado = ((a * peso1) + (b * peso2)) / (peso1 + peso2);
        return resultado;
    }
}
      