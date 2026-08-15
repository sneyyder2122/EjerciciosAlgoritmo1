public class QuintoEjercicio {
    public static void main(String[] args) {
        double nota1, nota2, nota3,promedioNotas;
        Float promedio,NotaExamen, TrabajoFinal;
        System.out.println("Bienvenido al calculador de promedio de notas. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese la nota del primer nota: ");
        nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la nota del segundo nota: ");
        nota2 = Double.parseDouble(System.console().readLine());  
        System.out.println("Ingrese la nota del tercer nota: ");
        nota3 = Double.parseDouble(System.console().readLine());
        promedioNotas = (nota1 + nota2 + nota3)/3;
        System.out.println("Ingrese la nota del examen final: ");
        NotaExamen = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota del trabajo final: ");
        TrabajoFinal = Float.valueOf(System.console().readLine());
        promedio= (float)((promedioNotas *0.55) + (NotaExamen *0.30) + (TrabajoFinal *0.15));
        System.out.println("El promedio final del estudiante es: " + promedio);
    }
}
