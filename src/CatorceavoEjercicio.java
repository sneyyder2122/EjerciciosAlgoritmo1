import java.util.Scanner;
public class CatorceavoEjercicio {
    public static void main (String[] args){
        int a;
        int b;
        int c;
        int tipo;
        double s;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lado A:");
        a = entrada.nextInt();
        System.out.println("Ingrese le lado B");
        b = entrada.nextInt();
        System.out.println("Ingrese el lado C");
        c = entrada.nextInt();
        if (a + b > c && a + c > b && b + c > a ){
            System.out.println("los datos corresponden a un triangulo.");

            if (a==b && b==c){
                tipo = 1;
            }else if ( a==b || b==c || a==c){
                tipo =2;
            }else
                tipo = 3;

            switch (tipo){
                case 1:
                    System.out.println("Los datos corresponden a un triángulo equilátero.");
                    break;
                case 2:
                    System.out.println("Los datos corresponden a un triángulo isoseles.");
                    break;
                case 3:
                    System.out.println("Los datos corresponden a un triángulo escaleno.");
                    break;

        }
            s = (a+b+c)/2.0;
            area = Math.sqrt(s*(s - a)*(s - b)*(s-c));



        }else {
            System.out.println("Los datos no corresponden a un triangulo");
        }
        entrada.close();
    }
}
