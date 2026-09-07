import java.util.Scanner;
public class DecimoEjercicio {
    public static void main (String[] args){
        String nombre;
        double compra;
        double descuento;
        double montoDescuento;
        double montoPagar;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.next();
        System.out.println("Ingrese el monto de la compra");
        compra = entrada.nextDouble();

        switch (Double.compare(compra, 500)) {
            case -1:
            case 0: {
                descuento = 0;
                break;
            }
            default: {
                switch (Double.compare(compra, 1000)) {
                    case -1:
                    case 0: {
                        descuento = 0.05;
                    }
                    break;
                default:{
                    switch (Double.compare(compra,7000)){
                        case -1:
                        case 0:{
                            descuento = 0.11;
                        }break;
                        default:{
                            switch (Double.compare(compra,15000)){
                                case -1:
                                case 0:{
                                    descuento = 0.18;
                                }break;
                                default:{
                                    descuento = 0.25;
                                }
                            }
                        }
                    }
                }
                }

            }
        }
        montoDescuento = compra * descuento;
        montoPagar = compra - montoDescuento;

        System.out.println("el nombre del cliente es "+nombre);
        System.out.println("El monto de la compra es "+compra);
        System.out.println("el descuento recibido es " +montoDescuento);
        System.out.println("el monto a pagar es "+montoPagar  );

        entrada.close();
    }
}
