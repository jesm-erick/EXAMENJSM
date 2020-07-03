package pe.edu.upeu.jsm;

import pe.edu.upeu.jsm.Examen.ResolucionExamen;

import pe.edu.upeu.jsm.utils.LeerTeclado;

public class App 
{
    public static void main( String[] args ) {

        LeerTeclado tecladoDcomienzo = new LeerTeclado();
        ResolucionExamen resolucionFinal = new ResolucionExamen();
        String opcion = "SI";
        int numeroDeAlg;
        String mensajeMenu ="1.- Impuesto Por Automoviles\n"+
                            "2.- Tabla de multiplicar\n"+
                            "3.- numero perfecto\n"+
                            "4.- Potencia con Recursividad";
        do{
            System.out.println(mensajeMenu);
                   
          numeroDeAlg=tecladoDcomienzo.leer(0,"Ingrese el Algoritmo que desea probar: ");

          
            switch(numeroDeAlg){
                case 1:  
                resolucionFinal.ImpuestoPorAutomoviles();      
                break;
                case 2: 
                resolucionFinal.tablademult();
                break;
                case 3:
                int N = tecladoDcomienzo.leer(0, "el numero perfecto a probar es: ");
                resolucionFinal.numerosEnt(N);
                break;
                case 4:
                int base=tecladoDcomienzo.leer(0,"ingrese la base: ");
                int expon=tecladoDcomienzo.leer(0,"ingrese el esponente: ");
                System.out.println("el resultado es: "+ resolucionFinal.potencRecur(base, expon));
                break;
                default: System.out.println("Num de Algoritmo no existe!!");break;
            }
        opcion=tecladoDcomienzo.leer("","Desea probar mas algoritmos? SI/NO");

        }while(opcion.equals("SI") || opcion.equals("si"));
    }
}
