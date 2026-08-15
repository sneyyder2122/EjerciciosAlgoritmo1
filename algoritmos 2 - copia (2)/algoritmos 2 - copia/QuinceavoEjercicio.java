public class QuinceavoEjercicio {
public static void main(String[] args) {

        float lecturaAnterior;
        float lecturaActual;
        float costoKw;
        float consumo;
        float total;

        System.out.println("Bienvenido al calculador de consumo de energía eléctrica. Por favor, ingrese los siguientes datos.");
        System.out.println("ingresa la lectura anterior:");
        lecturaAnterior = Float.parseFloat(System.console().readLine());

        System.out.println("ingresa la lectura actual:");
        lecturaActual = Float.parseFloat(System.console().readLine());

        System.out.println("ingresa el costo por kilovatio:");
        costoKw = Float.parseFloat(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        total = consumo * costoKw;

        System.out.println("Total a pagar: " + total);

    }
    
}

