package ejercicio_23;
import java.util.ArrayList;
import java.util.List;

public class Cuadratica {
    static List<Double> Formula(double a, double b, double c){
        double r1,r2;   
        
        List<Double> lista = new ArrayList<>();
        
        
        r1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
        r2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
        
        lista.add(r1);
        lista.add(r2);
        return lista;
    }   
}
