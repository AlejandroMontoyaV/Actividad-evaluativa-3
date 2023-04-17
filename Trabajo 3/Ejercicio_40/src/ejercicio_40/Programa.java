package ejercicio_40;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    static List<Double> Prog(double a){
        double r1, r2, r3;
        
        List<Double> lista = new ArrayList<>();
        
        r1= Math.sqrt(a);
        r2=Math.pow(a, 2);
        r3=Math.pow(a, 3);
        
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        
        return lista;                               
    }       
}
