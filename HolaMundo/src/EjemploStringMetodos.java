public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Joan";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Joan\") = " + nombre.equals("Joan"));
        System.out.println("nombre.equals(\"Joan\") = " + nombre.equals("joan"));
        System.out.println("nombre.equalsIgnoreCase(\"joan\") = " + nombre.equalsIgnoreCase("joan"));
        System.out.println("nombre.compareTo(\"Joan\") = " + nombre.compareTo("Joan"));
        System.out.println("nombre.compareTo(\"Juancito\") = " + nombre.compareTo("Juancito"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        

    }
}
