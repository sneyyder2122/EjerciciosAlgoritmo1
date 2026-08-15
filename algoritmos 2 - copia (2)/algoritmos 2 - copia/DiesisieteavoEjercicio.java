 public class DiesisieteavoEjercicio {
 public static void main(String[] args) {

        float precioPublico;
        float precioPagado;
        float descuento;
        Float porcentajeDescuento;

        System.out.println("Bienvenido al calculador de porcentaje de descuento. Por favor, ingrese los siguientes datos.");

        System.out.println(" Ingrese el valor de venta al público:");
        precioPublico = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el valor pagado:");
        precioPagado = Float.parseFloat(System.console().readLine());

        descuento = precioPublico - precioPagado;
        porcentajeDescuento = (descuento * 100) / precioPublico;
        System.out.println("El porcentaje de descuento es: " + String.format("%.2f", porcentajeDescuento) + "%");

    }       
    
}