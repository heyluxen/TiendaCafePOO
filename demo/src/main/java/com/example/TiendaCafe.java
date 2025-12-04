package com.example;

public class TiendaCafe {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("TIENDA DE CAFÉ COLOMBIANO - ACTIVIDAD POO");
        System.out.println("===========================================\n");
        
        // Instanciar al menos TRES objetos de la clase Cafe
        // con datos de cafés de diferentes regiones de Colombia
        
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 35000, 5.0);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 32000, 3.5);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 38000, 4.2);
        
        System.out.println("1. MOSTRAR INFORMACIÓN DE CADA CAFÉ:");
        System.out.println("-------------------------------------");
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();
        
        System.out.println("\n2. CALCULAR Y MOSTRAR PRECIO TOTAL DE CADA CAFÉ:");
        System.out.println("--------------------------------------------------");
        System.out.println(cafe1.getNombre() + ": $" + cafe1.calcularPrecioTotal() + " COP");
        System.out.println(cafe2.getNombre() + ": $" + cafe2.calcularPrecioTotal() + " COP");
        System.out.println(cafe3.getNombre() + ": $" + cafe3.calcularPrecioTotal() + " COP");
        
        System.out.println("\n3. ACTUALIZAR CANTIDAD DE UNO DE LOS CAFÉS:");
        System.out.println("--------------------------------------------");
        cafe1.actualizarCantidad(4.0f);
        
        System.out.println("\n4. MOSTRAR INFORMACIÓN ACTUALIZADA:");
        System.out.println("-----------------------------------");
        cafe1.mostrarInformacion();
        
        System.out.println("\n===========================================");
        System.out.println("PARTE 1 COMPLETADA - PROGRAMACIÓN POO EN JAVA");
        System.out.println("===========================================");
    }
}