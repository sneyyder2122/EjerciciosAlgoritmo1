import java.util.Scanner;
public class TercerEjercicio {
    public static void main (String[] args){
        double A;
        double B;
        double C;
        double D;
        double Resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor de A");
        A = entrada.nextDouble();
        System.out.println("ingrese el valor de B");
        B = entrada.nextDouble();
        System.out.println("ingrese el valor de C");
        C = entrada.nextDouble();
        System.out.println("ingrese el valor de D");
        D = entrada.nextDouble();

        switch (Double.compare(D, 0)){
            case 0:{
                Resultado = Math.pow(A - C, 2);
                System.out.println("El resultado es: " + Resultado);
                break;
            }
            case 1 :{
                Resultado =Math.pow (A - B, 3) / D;
                System.out.println("El resultado es: " + Resultado);
            }
            default:{
                System.out.println("D debe ser mayor o igual a 0");
            }
        }
        entrada.close();
    }
}
