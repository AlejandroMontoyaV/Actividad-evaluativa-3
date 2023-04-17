
package ejercicio_7;

public class Programa {
    static String Mayor(double A, double B){    
        String C;
        if(A>B){
            C= A+" es mayor que "+B;                       
        }
        else if(A==B){
            C= A+" es igual que "+B;
        }
        else{
            C= A+" es menor que "+B;
        }
        return C;        
    }
    
}
