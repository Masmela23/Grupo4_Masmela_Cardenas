package com.techsolutions.empresa;

public class Vendedor extends Empleado {
    // ATRIBUTOS ESPECÍFICOS DEL VENDEDOR
    private String zonaVentas;    // Ej: "Centro", "Sur", "Norte"
    private double porcentajeComision; // % de comisión sobre ventas
    private double metaMensual;   // Meta de ventas mensual

    // CONSTRUCTOR
    public Vendedor(String id, String nombre, double salarioBase,
                    String zonaVentas, double porcentajeComision, double metaMensual) {
        super(id, nombre, salarioBase);
        this.zonaVentas = zonaVentas;
        this.porcentajeComision = porcentajeComision;
        this.metaMensual = metaMensual;
    }

    // GETTERS
    public String getZonaVentas() {
        return zonaVentas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getMetaMensual() {
        return metaMensual;
    }

    // SETTERS
    public void setZonaVentas(String zona) {
        this.zonaVentas = zona;
    }

    public void setPorcentajeComision(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.porcentajeComision = porcentaje;
        }
    }

    public void setMetaMensual(double meta) {
        if (meta > 0) {
            this.metaMensual = meta;
        }
    }

    // MÉTODO SOBRESCRITO: Calcular salario base (sin comisión aquí)
    @Override
    public double calcularSalario() {
        // En un caso real, se agregaría la comisión real de ventas
        // Por ahora solo retorna el salario base
        return salarioBase;
    }

    // Método específico: Calcular comisión por ventas
    public double calcularComision(double ventasReales) {
        return ventasReales * (porcentajeComision / 100);
    }

    // Método específico: Calcular salario total con comisión
    public double calcularSalarioConComision(double ventasReales) {
        double comision = calcularComision(ventasReales);
        return salarioBase + comision;
    }

    // MÉTODO SOBRESCRITO: Mostrar información específica
    @Override
    public void mostrarInfo() {
        System.out.println("════════════════════════════════════");
        System.out.println("💰 Información del VENDEDOR");
        System.out.println("════════════════════════════════════");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Zona de Ventas: " + zonaVentas);
        System.out.println("Porcentaje de Comisión: " + porcentajeComision + "%");
        System.out.printf("Meta Mensual: $%.2f%n", metaMensual);
        System.out.printf("Salario Base: $%.2f%n", salarioBase);
        System.out.printf("Salario Total: $%.2f%n", calcularSalario());
        System.out.println("════════════════════════════════════");
    }
}
