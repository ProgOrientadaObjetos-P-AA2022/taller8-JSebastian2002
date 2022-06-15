/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author E.N.D
 */
public class DocenteFactura extends Docente{
    
    double valorfactura;
    double valoriva;
    double valorcancelar;
    
    public void establecerValorfactura(int fac){
        valorfactura = fac;
    }
    public void establecerValoriva(double descuento){
        valoriva = descuento;
    }
    public void calcularValorcancelar(){
        valorcancelar = valorfactura * valoriva;
    }
    public double obtenerValorfactura(){
        return valorfactura; 
    }
    public double obtenerValoriva(){
        return valoriva;
    }
    public double obtenerValorcancelar(){
                return valorcancelar;

    }

     @Override
        
    public String toString() {
        String reporte =  String.format("Factura\n"
                + "Valor Factura: %.2f\n"
                + "Valor iva: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerValorfactura(),
                obtenerValoriva(),
                obtenerValorcancelar());
        return reporte;
    }

    public void establecerValorfactura(double fc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
