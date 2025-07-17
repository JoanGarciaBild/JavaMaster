public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 11;
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        //Reglas para definir una variable
        String nombre;
        nombre = "Andrés";
        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        //Palabras reservadas no se pueden usar como nombre de variable
        //int class = 5;
        int e5dad1 = 5; // Correcto
        int edadPersona = 5; // Correcto
        // Evitar acentos y ñ
    }
}
