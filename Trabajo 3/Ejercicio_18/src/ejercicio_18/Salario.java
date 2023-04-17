package ejercicio_18;
public class Salario {
    public static double Bruto(double HorasTrabajada, double Valor, double Tax){
    double SalarioBruto;
    Tax=Tax/100;
    SalarioBruto = (HorasTrabajada*Valor)- (HorasTrabajada*Valor)*Tax;
    return SalarioBruto;
    }
    
}
