

public class DoceavoEjercicio {
    public static void main(String[] args) {
        
        Float examenMatematicas;
        Float tareaMatematica1;
        Float tareaMatematica2;
        Float tareaMatematica3;

        Float examenFisica;
        Float tareaFisica1;
        Float tareaFisica2;

        Float examenQuimica;
        Float tareaQuimica1;
        Float tareaQuimica2;
        Float tareaQuimica3;

        Float notaFinalMatematicas;
        Float notaFinalFisica;
        Float notaFinalQuimica;
        Float promedioGeneral;

        System.out.println("Bienvenido al calculador de notas finales. Por favor, ingrese los siguientes datos.");
        
        System.out.println("Ingrese la nota del examen de matematicas: ");
        examenMatematicas = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 1 de matematicas: ");
        tareaMatematica1 = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 2 de matematicas: ");
        tareaMatematica2 = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 3 de matematicas: ");
        tareaMatematica3 = Float.valueOf(System.console().readLine());
        
        System.out.println("Ingrese la nota del examen de fisica: ");
        examenFisica = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 1 de fisica: ");
        tareaFisica1 = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 2 de fisica: ");
        tareaFisica2 = Float.valueOf(System.console().readLine());

        System.out.println("Ingrese la nota del examen de quimica: ");
        examenQuimica = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 1 de quimica: ");
        tareaQuimica1 = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 2 de quimica: ");
        tareaQuimica2 = Float.valueOf(System.console().readLine());
        System.out.println("Ingrese la nota de la tarea 3 de quimica: ");
        tareaQuimica3 = Float.valueOf(System.console().readLine());

        notaFinalMatematicas = (float) ((examenMatematicas * 0.90) + (((tareaMatematica1 + tareaMatematica2 + tareaMatematica3) / 3) * 0.10));
        notaFinalFisica = (float) ((examenFisica * 0.80) + (((tareaFisica1 + tareaFisica2) / 2) * 0.20));
        notaFinalQuimica = (float) ((examenQuimica * 0.85) + (((tareaQuimica1 + tareaQuimica2 + tareaQuimica3) / 3) * 0.15));
        promedioGeneral = (float) (notaFinalMatematicas + notaFinalFisica + notaFinalQuimica) / 3;
        
        System.out.println("La nota final de matematicas es: " + String.format("%.2f", notaFinalMatematicas));
        System.out.println("La nota final de fisica es: " + String.format("%.2f", notaFinalFisica));
        System.out.println("La nota final de quimica es: " + String.format("%.2f", notaFinalQuimica));
        System.out.println("El promedio general es: " + String.format("%.2f", promedioGeneral));
    }
}
