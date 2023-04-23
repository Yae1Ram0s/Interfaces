package org.example.Herenciamultiple;

public class Alumno extends Persona{
    private int Numcuenta;
    private String carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(int numcuenta, String carrera, double promedio) {
        Numcuenta = numcuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Alumno(String nombre, int edad, int numcuenta, String carrera, double promedio) {
        super(nombre, edad);
        Numcuenta = numcuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumcuenta() {
        return Numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        Numcuenta = numcuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Numcuenta=" + Numcuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }


}
