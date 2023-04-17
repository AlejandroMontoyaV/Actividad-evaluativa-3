package figuras_geometricas;

public class Cuadrado {
    double lado;
    //variable que pueden usar todos los metodos de esta clase
    //esto basicamente es para poder asignarle el valor a la variable de clase anterior
    //lo de abajo dice this.variable(la local) es igual a la variable de la clase(la de arriba)
    //basicamente la función es, darle valor a el/los parametros de la clase(constructor)
    Cuadrado(double lado){
        this.lado = lado;
    }
    
    double perimetro(){
        return 4*lado;
    }
    
    double area(){
        return lado*lado;
    }
    
    
}
