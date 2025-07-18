public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "9123.59e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logitoStr = "true";
        boolean logicoBOolean = Boolean.parseBoolean(logitoStr);
        System.out.println("logicoBOolean = " + logicoBOolean);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e-2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        

    }
}
