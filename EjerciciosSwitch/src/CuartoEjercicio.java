import java.util.Scanner;

public class CuartoEjercicio {
    public static void main (String[] args){
        double Valor1;
        double Valor2;
        double Valor3;

        double AreaTriangulo;
        double AreaCirculo;
        double AreaRectactangulo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor 1");
        Valor1 = entrada.nextDouble();
        System.out.println("ingrese el valor 2");
        Valor2 = entrada.nextDouble();
        System.out.println("ingrese el valor 3");
        Valor3 = entrada.nextDouble();

        AreaTriangulo = (Valor1 * Valor2) / 2;
        AreaCirculo = Valor2 * Math.pow(Valor1, 2);
        AreaRectactangulo = Valor1 * Valor2;

        switch (Double.compare(AreaTriangulo,Valor3)){
            case 0:{
                System.out.println("La figura es un triangulo");
                System.out.println("El area del triangulo es "+AreaTriangulo);

                break;
            }
            default :
                switch (Double.compare(AreaCirculo,Valor3)){
                    case 0:{
                        System.out.println("La figura es un Circulo");
                        System.out.println("El area del Circulo es "+AreaCirculo);

                    }
                    default:
                        switch (Double.compare(AreaRectactangulo,Valor3)){
                            case 0:{
                                System.out.println("La figura es un Rectangulo");
                                System.out.println("El area del Rectangulo es "+AreaRectactangulo );

                            }
                        }
                }


        }
        entrada.close();

    }
}
