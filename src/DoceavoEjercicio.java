import java.util.Scanner;
public class DoceavoEjercicio {
public static void main (String[] args){
    double temperatura;
    Scanner entrada = new Scanner(System.in);

    System.out.println("ingrese la temperatura en grado fahrenheit");
    temperatura = entrada.nextDouble();

    switch (Double.compare(temperatura,85)){
        case 1:
            System.out.println("El deporte apropiado es: Natacion. ");
            break;
        default:
            switch (Double.compare(temperatura,70)){
                case 1:
                    System.out.println("El deporte apropiado es: Tenis. ");
                    break;
                default:
                    switch (Double.compare(temperatura, 32)){
                        case 1:
                            System.out.println("El deporte apropiado es: Golf ");
                            break;
                        default:
                            switch (Double.compare(temperatura, 10)){
                                case 1:
                                    System.out.println("El deporte apropiado es: Esqui. ");
                                    break;
                                default:
                                    System.out.println("El deporte apropiado es: Marcha. ");
                                    break;
                            }
                    }
            }
    }
    entrada.close();
    }
}
