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
    }
}
