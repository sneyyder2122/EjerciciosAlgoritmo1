public class SegundoEjercicio {
    public static void main(String[] args) {
        int inversion;
        System.out.println("Bienvenido al calculador de ganancia de una inversión. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese el capital a invertir:");
        inversion = Integer.parseInt(System.console().readLine());
        double ganancia = (inversion * 0.02);
        System.out.println("El total de ganancia después de un mes es: " + ganancia);
    }
}