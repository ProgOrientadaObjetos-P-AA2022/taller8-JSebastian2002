/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herenciados;
import herencia.DocenteNombramiento;
import herencia.DocenteFactura;
import herencia.Docente;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author E.N.D
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int seleccion;
        String Nombre;
        String cedula;
        System.out.println("Ingrese el nombre del Docente");
        Nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula del docente");
        cedula = entrada.nextLine();
        Docente dc = new Docente();
        
        dc.establecerNombre(Nombre);
        dc.establecerCedula(cedula);
        
        System.out.println("----------------------------");
        System.out.println("Nombre del docente");
        System.out.println(Nombre);
        System.out.println("----------------------------");
        
        
        System.out.println("----------------------------");
        System.out.println("Identificacion del docente");
        System.out.println(cedula);
        System.out.println("----------------------------");

 
        System.out.println("----------------------------------------------------");
        System.out.println("Menu de opciones");
        System.out.println("1: Crear objeto de tipo Docente Nombramiento");
        System.out.println("2: Crear objeto de tipo Docente Factura");
        System.out.println("Seleccione que desea crear");
        System.out.println("----------------------------------------------------");
        seleccion = entrada.nextInt();
        while (seleccion <= 2) {
            switch (seleccion) {
            case 1: 
                DocenteNombramiento dc1 = new DocenteNombramiento();
                double sueldo;
                double valorextra;
                int horas;
                System.out.println("-------------------------------------------------");
                System.out.println("Ingrese de datos para el docente");
                System.out.println(Nombre);
                System.out.println("De Identificacion");
                System.out.println(cedula);
                System.out.println("-------------------------------------------------");

                System.out.println("Ingrese el sueldo del docente");
                sueldo = entrada.nextDouble();
                System.out.println("Ingrese el valor extra del sueldo del docente");
                valorextra = entrada.nextDouble();
                System.out.println("Ingrese la cantidad de horas extra");
                horas = entrada.nextInt();
               
                dc1.establecerValorsueldo(sueldo);
                dc1.establecerValorextra(valorextra);
                dc1.establecerCantidadhoras(horas);
                dc1.calcularSueldototal();
                dc1.obtenersueldototal();

                System.out.println(dc1);
          
                break;
            case 2:
                DocenteFactura dc2 = new DocenteFactura();
                double fc;
                double iva;
                System.out.println("-------------------------------------------------");
                System.out.println("Ingrese de datos para el docente");
                System.out.println(Nombre);
                System.out.println("De Identificacion");
                System.out.println(cedula);
                System.out.println("-------------------------------------------------");

                System.out.println("Ingrese el valor de la factura");
                fc = entrada.nextDouble();
                System.out.println("Ingrese el valor del iva");
                iva = entrada.nextDouble();
                
                dc2.establecerValorfactura(fc);
                dc2.establecerValoriva(iva);
                dc2.calcularValorcancelar();
                dc2.obtenerValorcancelar();      
                break;
        }

    }
        System.out.println("Error, opción no válida\n");
    
}

        }
        