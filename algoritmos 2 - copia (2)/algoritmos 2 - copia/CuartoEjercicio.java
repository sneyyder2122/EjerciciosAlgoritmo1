public class CuartoEjercicio {
    public static void main(String[] args) {
        float totalcompra, descuento;
        System.out.println("Bienvenido al calculador de descuento de una compra. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese el total de la compra: ");
        totalcompra = Float.parseFloat(System.console().readLine());
        System.out.println("el valor del descuento es del 15% del total de la compra"); 
        descuento = totalcompra * 0.15f;
        System.out.println("El descuento aplicado es: $" + descuento);

    }
    
}
