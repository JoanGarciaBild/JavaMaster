import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samgung Galaxy", "Disco Duro SSD Samsung Externo",
        "Asus Notebook", "Mackbook Air", "Chromecast 4ta Generación", "Bicicleta Oxford"};
        int total = productos.length;

        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samgung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";
        */

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++){
            System.out.println("Indice ["+i+"] : " + productos[i]);
        }
        System.out.println();
        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < total; i++){
            System.out.println("Indice ["+(total-1-i)+"] : " + productos[total-1-i]);
        }

        System.out.println();
        System.out.println("=== Usando for inverso 2 ===");
        for(int i = total-1; i >= 0; i--){
            System.out.println("Indice ["+i+"] : " + productos[i]);
        }

    }

}
