
package ejercicio_10;

public class Matricula {
    static double Valor(double Patrimonio, double Estrato){
        double matricula;
        
        if(Patrimonio>2000000 && Estrato>3){
            matricula = 50000+Patrimonio*0.03;
        }
        else{
            matricula=50000;
        }
        return matricula;               
    }
    
}
