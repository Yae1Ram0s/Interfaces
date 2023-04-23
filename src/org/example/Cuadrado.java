package org.example;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Cudrado{" +
                "lado=" + lado +
                '}';
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this. lado * this.lado;
    }
}

