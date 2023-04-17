
package figuras_geometricas;

public class Rectangulo {
    double base, altura;
    
    Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    double perimetro(){
        return 2*base + 2*altura;
    }
    
    double area(){
        return base*altura;
    }          
}
