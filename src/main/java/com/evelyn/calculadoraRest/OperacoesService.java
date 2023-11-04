package com.evelyn.calculadoraRest;

import org.springframework.stereotype.Component;

@Component
public class OperacoesService {

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double n1, double n2){
        return (n2 != 0)? n1/n2 : 0;
    }

    public double dividir(double num1, double num2) {
    	return (num2 != 0)? num1/num2 : 0;
    }
}
