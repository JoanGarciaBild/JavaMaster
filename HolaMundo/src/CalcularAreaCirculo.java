import java.util.Scanner;

public class CalcularAreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();
        double area = Math.PI* Math.pow(radio, 2);
        System.out.println("area del circulo = " + area);

    }
}
