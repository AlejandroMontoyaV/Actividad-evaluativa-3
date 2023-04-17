package figuras_geometricas;

public class Circulo {
    double radio;
    
    Circulo(double radio){
        this.radio = radio;
        
    }
    double perimetro(){
        return 2 * Math.PI * radio;
    }
    
    double area(){
        return Math.PI * Math.pow(radio,2);
    }
}
