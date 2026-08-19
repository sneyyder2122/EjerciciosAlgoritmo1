public class OctavoEjercicio {
    public static void main(String[] args) {
        double DistanciaRecorrida;
        double pago;

        System.out.println("Ingresa los kilometros recorridos");
        DistanciaRecorrida = Double.parseDouble(System.console().readLine());
        if(DistanciaRecorrida <= 300){
            pago = 5000;
            System.out.println("el pago a realizar es " +pago);

        } else if (DistanciaRecorrida < 1000 ) {
            pago = 5000 + 200 * (DistanciaRecorrida -300) ;
            System.out.println("el pago a realizar es " +pago);

        }else if (DistanciaRecorrida >1000){
            pago = 5000 + 700 * 200 +  (DistanciaRecorrida-1000)*150 ; 
            System.out.println("el pago a realizar es " +pago);
        }
    }

}
