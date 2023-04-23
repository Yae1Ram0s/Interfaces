package org.example;

public class Main{

    public  static void main(String[] args){
        System.out.println("Hello world");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("area =" + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo: " + circulo.calcularArea());
    }
}