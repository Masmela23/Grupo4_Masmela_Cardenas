package com.techsolutions.empresa;

public class Contador extends Empleado {
    // ATRIBUTOS ESPECÍFICOS DEL CONTADOR
    private int clientesAcargo;       // Cantidad de clientes
    private String tipoCertificacion; // Ej: "CPA", "Contador Público"
    private int auditoriadosRealizadas; // Número de auditorías

    // CONSTRUCTOR
    public Contador(String id, String nombre, double salarioBase,
                    int clientesAcargo, String tipoCertificacion, int auditoriasRealizadas) {
        super(id, nombre, salarioBase);
        this.clientesAcargo = clientesAcargo;
        this.tipoCertificacion = tipoCertificacion;
        this.auditoriadosRealizadas = auditoriasRealizadas;
    }

    // GETTERS
    public int getClientesAcargo() {
        return clientesAcargo;
    }

    public String getTipoCertificacion() {
        return tipoCertificacion;
    }

    public int getAuditoriasRealizadas() {
        return auditoriadosRealizadas;
    }

    // SETTERS
    public void setClientesAcargo(int clientes) {
        if (clientes >= 0) {
            this.clientesAcargo = clientes;
        }
    }

    public void setAuditoriasRealizadas(int auditorias) {
        if (auditorias >= 0) {
            this.auditoriadosRealizadas = auditorias;
        }
    }

    // MÉTODO SOBRESCRITO: Calcular salario con bonificación por clientes
    @Override
    public double calcularSalario() {
        double bonificacionClientes = clientesAcargo * 500; // $500 por cliente
        return salarioBase + bonificacionClientes;
    }

    // MÉTODO SOBRESCRITO: Mostrar información específica
    @Override
    public void mostrarInfo() {
        System.out.println("════════════════════════════════════");
        System.out.println("📊 Información del CONTADOR");
        System.out.println("════════════════════════════════════");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Certificación: " + tipoCertificacion);
        System.out.println("Clientes a Cargo: " + clientesAcargo);
        System.out.println("Auditorías Realizadas: " + auditoriadosRealizadas);
        System.out.printf("Salario Base: $%.2f%n", salarioBase);
        System.out.printf("Bonificación por Clientes: $%.2f%n", calcularSalario() - salarioBase);
        System.out.printf("Salario Total: $%.2f%n", calcularSalario());
        System.out.println("════════════════════════════════════");
    }
}
