package ejercicio_22;

public class Programa {
    static String Salario(double salarioH, double horas,String nombre){
        String resultado;
        if (salarioH*horas>=450000){
            resultado=nombre+", salario:"+salarioH*horas;
        } 
        else {
            resultado=nombre;
        }
        return resultado;
    }
    
}
