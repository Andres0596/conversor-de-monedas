import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultaDivisa divisa = new ConsultaDivisa();
        DecimalFormat formato = new DecimalFormat("#.##");

        String base_code, target_code;
        double cantidad = 0;
        double cambio;

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("****************************************\n");
            System.out.println("Bienvenido al Conversor de Divisas\n");
            System.out.println("""
                    1- Dólar a Peso argentino
                    2- Peso argentino a Dólar
                    3- Dólar a Real brasileño
                    4- Real brasileño a Dólar
                    5- Dólar a Peso colombiano
                    6- Peso colombiano a Dólar
                    7- Salir""");
            System.out.print("\nSelecciona una opción: ");
            opcion = input.nextInt();
            System.out.println("****************************************\n");
            System.out.println("Ingrese la cantidad a convertir: ");
            if (opcion != 7) {
                cantidad = input.nextDouble();
            }
            switch (opcion){
                case 1:
                    base_code = "USD";
                    target_code = "ARS";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 2:
                    base_code = "ARS";
                    target_code = "USD";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 3:
                    base_code = "USD";
                    target_code = "BRL";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 4:
                    base_code = "BRL";
                    target_code = "USD";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 5:
                    base_code = "USD";
                    target_code = "COP";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 6:
                    base_code = "COP";
                    target_code = "USD";
                    cambio = divisa.verDivisa(base_code,target_code,cantidad);
                    System.out.println("La conversion de: "+cantidad+base_code+" es de: "+formato.format(cambio)+target_code);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    opcion = 7;
                    break;
                default:
                    System.out.println("Seleccione una opción valida.");
                    continue;
            }


            System.out.println("****************************************\n");
        }
    }
}
