package pe.edu.upeu.jsm.Examen;
import pe.edu.upeu.jsm.utils.LeerTeclado;
public class ResolucionExamen {
    LeerTeclado teclado=new LeerTeclado();
    public void ImpuestoPorAutomoviles() {
        int numero;
        double total1 = 0, total2 = 0, total3 = 0, total_final = 0;
        for(int j = 1; j <= 3;j++) {
            numero = teclado.leer(0, "Ingrese la cantidad de autos en la "+j+" categoria: ");
            if(numero>0) {
                for(int i = 0; i < numero; i++) {
                    if (j == 1) {
                        double categoria1[] = new double[numero];
                        categoria1[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total1 += categoria1[i] * 0.1;
                        System.out.println("El 10% es: "+total1);
                    }else if(j == 2) {
                        double categoria2[] = new double[numero];
                        categoria2[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total2 += categoria2[i] * 0.07;
                        System.out.println("El 7% es: "+total2);
                    }else{
                        double categoria3[] = new double[numero];
                        categoria3[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total3 += categoria3[i] * 0.05;
                        System.out.println("El 5% es: "+total3);
                    }
                }
            }else{System.out.println("El numero es incorrecto");}
        }
        total_final = total1 + total2 + total3;
        System.out.println("El total de la categoria 1 es: "+total1);
        System.out.println("El total de la categoria 2 es: "+total2);
        System.out.println("El total de la categoria 3 es: "+total3);
        System.out.println("El total de las 3 categorias es: "+ total_final);
    }
        
    
    public void  tablademult() {
        int total=0;
        for(int i =1;i <= 20;i ++) {
            System.out.println("la tabla de multiplicar del"+i +": \n");
            for(int i2 =1;i2<= 10;i2++) {
                total=i*i2;
                System.out.println(i+"x"+i2+"="+total);
            }
            System.out.println("\n");
        }

    }
    public void numerosEnt(int N){
        int i=1;
        while(i<N){
            if(N%i==0){
                System.out.println("los n divisores propios son: "+i);
            }else{
            }
            i++;

        }
    }
    public int potencRecur(int base, int exponente) {
        if(exponente==0) {
            return 1;
        }else{
            return base * (int)Math.pow(base,exponente - 1);
        }
}

    
}