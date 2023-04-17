
package ejercicio_19;

public class Triangulo {
    double lado;
    
    //recordar el static, para poder usarlo por fuera de esta clase
    static double Perimetro(double lado){               
        return 3*lado;
    }
    
    static double Altura(double lado){
        return Math.sqrt(Math.pow(lado,2) - Math.pow(lado/2,2));
    }
    
    static double Area(double lado){
        return (lado * Altura(lado))/2;
    }
                
}
