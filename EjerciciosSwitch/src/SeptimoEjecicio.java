import java.util.Scanner;
public class SeptimoEjecicio {
    public static void main (String[] args){
        int A;
        int B;
        int C;
        int D;
        int N;
        int N1;
        int N2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor de A");
        A= entrada.nextInt();
        System.out.println("Ingresa el valor de B");
        B= entrada.nextInt();
        System.out.println("Ingresa el valor de C");
        C= entrada.nextInt();
        System.out.println("Ingresa el valor de D");

        D= entrada.nextInt();
        N= A * 1000 + B * 100 + C * 10 + D;
        System.out.println("El numero es: "+N);

        switch (Integer.compare(C,5)){
            case -1:{
                N1 = A * 1000 + B * 100 ;
                System.out.println("Si redondeamos, N=: "+N1);
            }break;
            case 0:{
                N2 = A * 1000 + (B + 1) * 100 ;

            }break;
            default:{
                N2 = A * 1000 + (B + 1) * 100;
                System.out.println("Si redondeamos, N = " + N2);
            }break;
        }
        entrada.close();

    }
}
