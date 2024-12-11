import java.util.Scanner;

public class ConversionMoneda {

    public static void convertir(String base, String destino, ConsultaMoneda consulta, Scanner lectura) {
        Moneda moneda = consulta.buscarMoneda(base, destino);
        if (moneda == null) {
            System.out.println("No se pudo obtener la tasa de conversión.");
            return;
        }

        System.out.printf("Tasa de conversión para hoy: 1 %s = %.2f %s\n", base, moneda.conversion_rate(), destino);
        System.out.print("Ingrese la cantidad de " + base + ": ");
        double cantidad = Double.parseDouble(lectura.nextLine());

        double cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.printf("%.2f %s equivalen a %.2f %s.\n", cantidad, base, cantidadConvertida, moneda.target_code());
    }

    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
        System.out.print("Ingrese el código de la moneda base: ");
        String base = lectura.nextLine().toUpperCase().trim();
        System.out.print("Ingrese la moneda de destino: ");
        String destino = lectura.nextLine().toUpperCase().trim();
        convertir(base, destino, consulta, lectura);
    }
}
