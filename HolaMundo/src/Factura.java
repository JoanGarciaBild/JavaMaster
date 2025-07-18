import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String factura = scanner.nextLine();
        System.out.println("Ingrese el precio #1: ");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio #2: ");
        double precio2 = scanner.nextDouble();
        double total = precio1 + precio2;
        double impuesto = total * 0.19;
        double totalMasImpuesto = total + impuesto;
        String mensaje = "La factura " + factura + " tiene un total bruto de " + total + ", con un impuesto de ";
        mensaje += "\n" + impuesto + " y el monto después de impuesto es de " + totalMasImpuesto;
        System.out.println(mensaje);
    }
}
