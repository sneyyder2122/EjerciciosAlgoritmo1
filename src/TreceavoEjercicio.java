import java.util.Scanner;
public class TreceavoEjercicio {
    public static void main (String[] args){

            int cantidad;


            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de Bolívares:");
            cantidad = entrada.nextInt();



            switch (1) {

                case 1:
                    System.out.println("Billetes de 50000: " + (cantidad / 50000));


                case 2:
                    System.out.println("Billetes de 20000: " + (cantidad / 20000));


                case 3:
                    System.out.println("Billetes de 10000: " + (cantidad/ 10000));

                case 4:
                    System.out.println("Billetes de 5000: " + (cantidad / 5000));

                case 5:
                    System.out.println("Billetes de 2000: " + (cantidad / 2000));


                case 6:
                    System.out.println("Billetes de 1000: " + (cantidad / 1000));


                case 7:
                    System.out.println("Billetes de 500: " + (cantidad / 500));


                case 8:
                    System.out.println("Billetes de 100: " + (cantidad / 100));


                case 9:
                    System.out.println("Billetes de 50: " + (cantidad / 50));


                case 10:
                    System.out.println("Billetes de 20: " + (cantidad / 20));


                case 11:
                    System.out.println("Billetes de 10: " + (cantidad / 10));


                    break;
            }

            entrada.close();
    }
}
