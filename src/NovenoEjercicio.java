import java.util.Scanner;
public class NovenoEjercicio {
    public static void main (String[] args){
        int P;
        int Q;
        double Resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el valor de P");
        P = entrada.nextInt();
        System.out.println("Ingresa el valor de Q");
        Q = entrada.nextInt();
        Resultado = Math.pow(P, 3)+ Math.pow(Q, 4)- 2* Math.pow(P, 2);

        switch (Double.compare(Resultado, 680)){
            case 1: {
                System.out.println("los valores P y Q satisfacen la expresion ");
                System.out.println("P = " + P);
                System.out.println("Q = " + Q);
            }
            default:{
                System.out.println("los valores ingreasados no satisfacen la expresion");
            }
        }
        entrada.close();
    }
}
