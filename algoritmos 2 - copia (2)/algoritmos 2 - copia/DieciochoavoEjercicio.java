public class DieciochoavoEjercicio {
    public static void main(String[] args) {

        int galones;
        float litros;
        float totalPagar;

        System.out.println("Bienvenido al calculador de litros y total a pagar por galones surtidos. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese la cantidad de galones surtidos:");
        galones = Integer.parseInt(System.console().readLine());

        litros = (float) (galones * 3.785);
        totalPagar = litros * 100;

        System.out.println("Los litros surtidos son: " + litros);
        System.out.println("El total a pagar es: " + totalPagar + " Bolívares");

    }    
    
}

