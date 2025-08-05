class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }

}

public class PasarporReferencia2 {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Joan");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        
    }

    public static  void test(Persona persona){
        System.out.println("iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }

}
