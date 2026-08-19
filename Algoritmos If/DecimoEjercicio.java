public class DecimoEjercicio {
    public static void main(String[] args) {
            String nombre;
            double compra;
            double descuento; 
            double montoDescuento;
            double montoPagar;

            System.out.println("Ingrese el nombre del cliente");
            nombre = (System.console().readLine());
            System.out.println("Ingrese el monto de la compra");
            compra = Double.parseDouble(System.console().readLine());

            if (compra <500 ){
                descuento = 0; 
            }else if (compra <1000){
                descuento = 0.05;
            }else if (compra < 7000  ){
                descuento= 0.11;
            }else if (compra <= 15000){
                descuento = 0.18;
            } else {
                descuento = 0.25;
            }

            montoDescuento = compra * descuento;
            montoPagar = compra - montoDescuento;

            System.out.println("el nombre del cliente es "+nombre);
            System.out.println("El monto de la compra es "+compra);
            System.out.println("el monto a pagar es "+montoPagar  );
            System.out.println("el descuento recibido es " +montoDescuento);
    }
}
