public class DiecisieteavoEjercicio {
    public static void main(String[] args) {
                double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costo;
        double monto;
        double aseo;

        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la lectura actual:");
        lecturaActual = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor del aseo:");
        aseo = Double.parseDouble(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        if (consumo >= 0  && consumo <= 100) {
            costo = 2622.00;
        } else if (consumo <= 300) {
            costo = 79.78;
        } else if (consumo <= 500) {
            costo = 89.52;
        } else {
            costo = 97.95;
        }

        monto = consumo * costo + aseo;

        System.out.println("Consumo: " + consumo + " KWh");
        System.out.println("Costo por KWh: " + costo + " Bs");
        System.out.println("Monto a pagar: " + monto + " Bs");
    }
}