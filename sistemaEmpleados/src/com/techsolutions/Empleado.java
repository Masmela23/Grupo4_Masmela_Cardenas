package com.techsolutions.empresa;

public class Empleado {
    // ATRIBUTOS (datos generales de cualquier empleado)
    protected String id;
    protected String nombre;
    protected double salarioBase;

    // CONSTRUCTOR - Inicializa los datos del empleado
    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // GETTERS - Métodos para obtener valores
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // SETTERS - Métodos para modificar valores
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public void setSalarioBase(double salario) {
        if (salario > 0) {
            this.salarioBase = salario;
        } else {
            System.out.println("El salario debe ser positivo");
        }
    }

    // MÉTODOS GENERALES

    // Método para calcular el salario (será sobrescrito por subclases)
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("════════════════════════════════════");
        System.out.println("📦 Información del Empleado");
        System.out.println("════════════════════════════════════");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Salario Base: $%.2f%n", salarioBase);
        System.out.printf("Salario Total: $%.2f%n", calcularSalario());
        System.out.println("════════════════════════════════════");
    }
}

