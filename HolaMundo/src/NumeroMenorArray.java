import java.util.Scanner;

public class NumeroMenorArray {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa el número [" + i + "]");
            numeros[i] = scanner.nextInt();
        }
        int menor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El número menor  es = " + menor);

    }
}
