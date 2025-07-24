public class SentenciaForEach {

    public static void main(String[] args) {
        
        int[] arreglo = {1,2,3,4,5,10,20,30,45};
        
        for(int num: arreglo){
            System.out.println("num = " + num);
        }
        
        String[] nombres = {"joan", "manuel", "alexander", "garcía", "cedano"};
        
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
        
    }
    
}
