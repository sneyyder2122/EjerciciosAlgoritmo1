public class VeintiunavoEjercicio {
    public static void main(String[] args) {
        float cantidadNaranjas;
        float precioDocena;
        float dineroObtenido;
        float docenas;
        float costoCompra;
        float ganancia;
        float porcentajeGanancia;

        System.out.println ("Bienvenido al programa para calcular el porcentaje de ganancia obtenido. Porfavor, ingresa los siguentes datos.");
        System.out.println("\n Cantidad de naranjas:");
        cantidadNaranjas = Float.parseFloat (System.console().readLine());
        System.out.println("Precio por docena:");
        precioDocena = Float.parseFloat (System.console().readLine());
        System.out.println("Dinero obtenido por la venta:");
        dineroObtenido = Float.parseFloat (System.console().readLine());

        docenas = cantidadNaranjas / 12;
        costoCompra = docenas * precioDocena;
        ganancia = dineroObtenido - costoCompra;
        porcentajeGanancia = (ganancia * 100) / costoCompra;

        System.out.println("Porcentaje de ganancia: " + String.format("%.2f", porcentajeGanancia) + "%");

    }
}