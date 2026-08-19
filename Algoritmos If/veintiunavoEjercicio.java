public class veintiunavoEjercicio {
    public static void main(String[] args) {
        int hipoteca; 
        int totalInversion;
        int restoInversion;
        double inversion;
        double hipotecaSocio;
        double inversion2;
        
        System.out.println("Ingrese el valor de la hipoteca:");
        hipoteca = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de la inversion:");
        totalInversion = Integer.parseInt(System.console().readLine());

        if (hipoteca < 1000000) {
         inversion = (totalInversion * 0.50);
         hipotecaSocio = (hipoteca * 0.50);
            System.out.println("El valor de la inversion es: " + inversion);
            System.out.println("Su socio debera invertir: " + hipotecaSocio);
        } else {
            restoInversion = totalInversion - hipoteca;
            inversion2 = restoInversion/2;
            System.out.println("El valor restante de la inversion es de: " + restoInversion);
            System.out.println("Entre su socio y usted, deben pagar: " + inversion2 + " cada uno");
        }
    }
}

