/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author E.N.D
 */
public class DocenteNombramiento extends Docente{
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
        matriculaDistancia: Real*/ 
    //  Métodos establecer y calcular para los datos o atributos de la clase
    double valorsueldo;
    double valorextra;
    int cantidadhoras;
    double sueldototal;

    public void establecerValorsueldo(double sueldo){
        valorsueldo = sueldo;
    }
    public void establecerValorextra(double extra){
        valorextra = extra;
    }
    public void establecerCantidadhoras(int cantidad){
        cantidadhoras = cantidad;
    }
    public void calcularSueldototal(){
        sueldototal = valorsueldo * valorextra;
    }
    public double obtenerValorsueldo(){
        return valorsueldo; 
    }
    public double obtenerValorextra(){
        return valorextra;
    }
    public double obtenerCantidadhoras(){
        return cantidadhoras;
    }
    public double obtenersueldototal(){
        return sueldototal;
    }

    @Override
    public String toString() {
        String reporte =  String.format("Nombramiento\n"
                + "Sueldo: %.2f\n"
                + "Sueldo valor extra: %.2f\n"
                + "Cantidad de horas extra: %d\n"
                + "Sueldo total: %.2f\n",
                obtenerValorsueldo(),
                obtenerValorextra(),
                obtenerCantidadhoras(),
                obtenersueldototal());
        return reporte;
    }
}

