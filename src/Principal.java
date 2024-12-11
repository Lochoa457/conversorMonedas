import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        while (true) {
            mostrarMenu();
            int opcion = lectura.nextInt();
            lectura.nextLine();  // Limpiar el buffer de entrada

            if (opcion == 7) {
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            }

            realizarConversion(opcion, consulta, lectura);
        }
    }

    private static void mostrarMenu() {
        System.out.println("Bienvenido/a al conversor de monedas");
        System.out.println("Selecciona la conversión que deseas realizar:");
        System.out.println("1. De USD (Dólar estadounidense) a MXN (Peso mexicano)");
        System.out.println("2. De MXN (Peso mexicano) a USD (Dólar estadounidense)");
        System.out.println("3. De USD (Dólar estadounidense) a COP (Peso colombiano)");
        System.out.println("4. De COP (Peso colombiano) a USD (Dólar estadounidense)");
        System.out.println("5. De USD (Dólar estadounidense) a BRL (Real brasileño)");
        System.out.println("6. De BRL (Real brasileño) a USD (Dólar estadounidense)");
        System.out.println("7. Convertir entre otras monedas");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8): ");
    }

    private static void realizarConversion(int opcion, ConsultaMoneda consulta, Scanner lectura) {
        switch (opcion) {
            case 1:
                ConversionMoneda.convertir("USD", "MXN", consulta, lectura);
                break;
            case 2:
                ConversionMoneda.convertir("MXN", "USD", consulta, lectura);
                break;
            case 3:
                ConversionMoneda.convertir("USD", "COP", consulta, lectura);
                break;
            case 4:
                ConversionMoneda.convertir("COP", "USD", consulta, lectura);
                break;
            case 5:
                ConversionMoneda.convertir("USD", "BRL", consulta, lectura);
                break;
            case 6:
                ConversionMoneda.convertir("BRL", "USD", consulta, lectura);
                break;
            case 7:
                ConversionMoneda.convertirOtraMoneda(consulta, lectura);
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
        }
    }
}