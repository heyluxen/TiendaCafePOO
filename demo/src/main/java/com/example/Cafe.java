package com.example;

public class Cafe {
    // Atributos exactamente como pide la actividad
    private String nombre;
    private String region;
    private double precioPorKilo;
    private double cantidadEnKilos;
    
    // 1. CONSTRUCTOR para inicializar los atributos
    public Cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }
    
    // 2. Método mostrarInformacion(): Muestra los detalles del café
    public void mostrarInformacion() {
        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Región de origen: " + region);
        System.out.println("Precio por kilo: $" + precioPorKilo + " COP");
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println("Precio total: $" + calcularPrecioTotal() + " COP");
    }
    
    // 3. Método calcularPrecioTotal(): Calcula precioPorKilo * cantidadEnKilos
    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }
    
    // 4. Método actualizarCantidad(float nuevaCantidad): Actualiza la cantidad disponible
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad actualizada para " + nombre + ": " + nuevaCantidad + " kg");
    }
    
    // Getters (para usar en TiendaCafe)
    public String getNombre() {
        return nombre;
    }
    
    public String getRegion() {
        return region;
    }
    
    public double getPrecioPorKilo() {
        return precioPorKilo;
    }
    
    public double getCantidadEnKilos() {
        return cantidadEnKilos;
    }
}