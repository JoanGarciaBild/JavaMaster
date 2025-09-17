import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

    }

}
