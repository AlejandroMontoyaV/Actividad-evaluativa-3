package ejercicio_41;

public class Programa {
    static String Mayor(double a, double b){
        String mayor;
        if(a>b){
            mayor=a+" es mayor que "+b;
        } 
        else{
            mayor=b+" es mayor que "+a;
        }
        return mayor;
    }   
}
