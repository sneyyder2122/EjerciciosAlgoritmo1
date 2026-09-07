import java.util.Scanner;
public class DieciseisavoEjercicio {
    public static void main (String[] args) {
        int decision;
        double precio;
        double porcentajeDevaluacion;
        double porcentajeIncremento;
        double devaluacion;
        double incremento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del auto y terreno:");
        precio = entrada.nextDouble();
        System.out.println("Ingresa el porcentaje de devaluacion anual del auto: ");
        porcentajeDevaluacion = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de incremento del terreno: ");
        porcentajeIncremento = entrada.nextDouble();

        devaluacion = precio * porcentajeDevaluacion / 100 * 3;
        incremento = precio *  porcentajeIncremento / 100 * 3;

        if(devaluacion <= incremento /2){
            decision=1;
        }else{
            decision=2;
        }
        switch (decision){
            case 1:
                System.out.println("Debe comprar el auto. ");
                System.out.printf("Devaluacion del automovil: $ %.3f%n", devaluacion);
                System.out.printf("Incremento del terreno: $ %.3f%n", incremento);
                break;
            case 2:
                System.out.println("No debe comprar el auto. ");
                System.out.printf("Devaluacion del automovil: $ %.3f%n", devaluacion);
                System.out.printf("Incremento del terreno: $ %.3f%n", incremento);
                break;
            default:
                System.out.println("datos no validos");
        }
        entrada.close();
    }
}
