public class DiecinueveavoEjercicio {
public static void main(String[] args) {

        float presupuesto;
        float ginecologia;
        float traumatologia;
        float pediatria;

        System.out.println("Bienvenido al calculador de presupuesto para un hospital. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese el presupuesto anual del hospital:");
        presupuesto = Float.parseFloat(System.console().readLine());

        ginecologia = (float) (presupuesto * 0.40);
        traumatologia = (float) (presupuesto * 0.30);
        pediatria = (float) (presupuesto * 0.30);

        System.out.println("\n Presupuesto para Ginecología: " + ginecologia);
        System.out.println("Presupuesto para Traumatología: " + traumatologia);
        System.out.println("Presupuesto para Pediatría: " + pediatria);

    }

    
}

