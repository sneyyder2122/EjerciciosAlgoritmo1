public class PrimerEjercicio{
    public static void main(String[] args) {
        int edad1;
        int edad2;
        int edad3;
        System.out.println("Bienvenido al calculador de promedio de edades. Por favor, ingrese las siguientes datos.");
        System.out.println("Ingrese la edad de la primera persona:");
        edad1=Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la edad de la segunda persona:");
        edad2=Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la edad de la tercera persona:");
        edad3=Integer.parseInt(System.console().readLine());

        double promedio =(edad1 + edad2 + edad3)/3.0;
        System.out.println("El promedio de las edades es: " + promedio);


    }
}