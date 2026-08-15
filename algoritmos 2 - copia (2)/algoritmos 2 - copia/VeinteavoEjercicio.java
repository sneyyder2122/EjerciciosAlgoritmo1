public class VeinteavoEjercicio{
    public static void main(String[] args) {
        
        float capital;
        float interes;
        float tiempo = 4;
        float porcentajeAnual;

        System.out.println("bienvenido al programa para el % anual de un prestamo");
        System.out.println("Ingrese el capital del préstamo:");
        capital = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el interés pagado:");
        interes = Float.parseFloat(System.console().readLine());
        
        porcentajeAnual = (interes * 100) / (capital * tiempo);
        System.out.println("El porcentaje anual cobrado es: " + String.format("%.2f", porcentajeAnual) + "%");
    }
}      