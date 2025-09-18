import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];
        int total =  productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samgung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("=== USANDO FOR ===");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=== USANDO FOR EACH ===");
        for(String producto: productos){
            System.out.println("producto = " + producto);
        }

        System.out.println("=== USANDO WHILE ===");
        int i = 0;
        while(i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        int j = 0;
        System.out.println("=== USANDO DO WHILE ===");
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while(j < total);

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;

        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k * 3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }

    }

}
