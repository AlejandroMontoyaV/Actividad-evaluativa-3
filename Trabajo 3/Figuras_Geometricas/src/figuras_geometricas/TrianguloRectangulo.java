package figuras_geometricas;

public class TrianguloRectangulo {
    double base, altura;    
    
    TrianguloRectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;   
    }
    //se define el metodo pa calcular hipotenusa, usa las variables de la clase
    //las cuales ya tienen valor asginado(objeto), gracias al this.
    double hipot(){
        return Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));             
    }
    
    double perimetro(){
        return base + altura+ hipot();
    }
    
    double area(){
        return (base*altura)/2;
    }
    
    String clase(){
        String tipo;
        
        if((base == altura) && (base==hipot()) && (altura==hipot())){
            tipo="Equilatero";
        }
        
        else if ((base != altura) && (base != hipot()) && (altura != hipot())){
            tipo="Escaleno";
        }
        
        else{
            tipo="Isoseles";
        }
        
        return tipo;
    }         
}
