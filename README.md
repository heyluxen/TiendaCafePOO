# TiendaCafePOO

## Descripción
Sistema de gestión de inventario para tienda de café implementado en Java con Programación Orientada a Objetos. 
Permite administrar productos de café colombiano, calcular precios, actualizar inventario y aplicar descuentos, 
integrando prácticas de control de versiones con Git/GitHub.

## Estructura del Proyecto
TiendaCafePOO/
├── demo/ # Proyecto Maven
│ ├── src/main/java/com/example/
│ │ ├── Cafe.java # Clase producto café
│ │ ├── Main.java # Punto de entrada
│ │ └── TiendaCafe.java # Clase principal del sistema
│ └── pom.xml # Configuración Maven
├── info.json # Metadatos del proyecto
└── README.md # Documentación principal

## Archivos Principales

### "Cafe.java"
Clase que define objetos café con atributos (nombre, región, precio, cantidad) y métodos para mostrar información, 
calcular precios totales, actualizar stock y aplicar descuentos.

### "TiendaCafe.java"
Clase principal que instancia cafés de diferentes regiones colombianas (Nariño, Antioquia, Huila) y ejecuta todas 
las operaciones del sistema: muestra información, calcula totales, actualiza cantidades y aplica descuentos.

### "Main.java"
Punto de entrada del programa que inicia la ejecución llamando a "TiendaCafe.main()"

## Funcionalidades Implementadas

### Gestión de Productos (Cafe.java)
- **Atributos:** "nombre", "region", "precioPorKilo", "cantidadEnKilos"
- **Constructor:** Inicialización de objetos café
- **mostrarInformacion():** Presenta detalles del producto
- **calcularPrecioTotal():** Calcula valor total (precio × cantidad)
- **actualizarCantidad():** Modifica stock disponible
- **aplicarDescuento():** Reduce precio según porcentaje (1-100%)

### Sistema de Tienda (TiendaCafe.java)
- Creación de múltiples objetos café de diferentes regiones
- Ejecución secuencial de operaciones:
  1. Mostrar información detallada de productos
  2. Calcular y mostrar precios totales
  3. Actualizar cantidades del inventario
  4. Aplicar descuentos especiales

### Cafés Colombianos Incluidos
- **Café de Nariño** - $35,000 COP/kg (5.0 kg)
- **Café de Antioquia** - $32,000 COP/kg (3.5 kg)  
- **Café del Huila** - $38,000 COP/kg (4.2 kg)
