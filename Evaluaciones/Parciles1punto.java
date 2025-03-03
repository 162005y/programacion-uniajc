import java.util.Scanner;

public class DulceAlgoritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes de costos
        final double COSTO_MATERIA_PRIMA = 2.50;
        final double COSTO_EMPAQUE = 0.50;
        final int BARRAS_POR_CAJA = 10;
        final double GANANCIA = 1.30; // 30% de ganancia

        // Entrada de datos
        System.out.print("Ingrese la cantidad de barras producidas en un día: ");
        int cantidadBarras = scanner.nextInt();

        // Cálculo del costo total de producción
        double costoProduccionPorBarra = COSTO_MATERIA_PRIMA + COSTO_EMPAQUE;
        double costoTotalProduccion = cantidadBarras * costoProduccionPorBarra;

        // Cálculo del precio de venta
        double precioVentaPorBarra = costoProduccionPorBarra * GANANCIA;
        double ingresoTotal = cantidadBarras * precioVentaPorBarra;

        // Cálculo de cajas completas y barras sobrantes
        int cajasCompletas = cantidadBarras / BARRAS_POR_CAJA;
        int barrasSobrantes = cantidadBarras % BARRAS_POR_CAJA;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.printf("Costo total de producción: $%.2f%n", costoTotalProduccion);
        System.out.printf("Precio de venta por barra: $%.2f%n", precioVentaPorBarra);
        System.out.printf("Ingreso total del día: $%.2f%n", ingresoTotal);
        System.out.printf("Cajas completas: %d%n", cajasCompletas);
        System.out.printf("Barras sobrantes: %d%n", barrasSobrantes);

        scanner.close();
    }
}