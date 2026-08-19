public class DieciseisavoEjercicio {
    public static void main(String[] args) {
        double precio;
        double porcentajeDevaluacion;
        double porcentajeIncremento;
        double devaluacion;
        double incremento;

        System.out.println("Ingrese el valor del auto y terreno:");
        precio = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa el porcentaje de devaluacion anual del auto: ");
        porcentajeDevaluacion = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el porcentaje de incremento del terreno: ");
        porcentajeIncremento = Double.parseDouble(System.console().readLine());

        devaluacion = precio * porcentajeDevaluacion / 100 * 3; 
        incremento = precio *  porcentajeIncremento / 100 * 3;

        if (devaluacion <= incremento /2) {
            System.out.println("Debe comprar el auto. ");
            System.out.printf("Devaluacion del automovil: $ %.5f%n", devaluacion);
            System.out.printf("Incremento del terreno: $ %.5f%n", incremento);
        }else {
            System.out.println("No debe comprar el auto. ");
            System.out.println("Devaluacion del automovil: $ %.5f%n" + devaluacion);
            System.out.printf("Incremento del terreno: $ %.5f%n", incremento);
        }

    }
}

