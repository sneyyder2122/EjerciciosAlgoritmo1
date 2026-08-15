public class VeintidosavoEjercicio {
    public static void main(String[] args) {

        float precioContado;
        float valorCuota;
        float totalCuotas;
        float recargo;
        float porcentajeRecargo;
        
        System.out.println( "bienvenido al programa para calcular el porcentaje de recargo. Por favor, ingrese los siguientes datos");
        System.out.println("ingrese el precio de contado:");
        precioContado = Float.parseFloat(System.console().readLine());
        System.out.println("Valor de cada cuota:");
        valorCuota = Float.parseFloat(System.console().readLine());

        totalCuotas = valorCuota * 12;
        recargo = totalCuotas - precioContado;
        porcentajeRecargo = (recargo * 100) / precioContado;

        System.out.println("El recargo es" +recargo);
        System.out.println("El porcentaje de recargo es: " + porcentajeRecargo + "%");

    }   
}
