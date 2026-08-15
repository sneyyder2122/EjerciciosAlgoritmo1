public class OnceavoEjercicio {

    public static void main(String[] args) {


        String nombre;
        float horasNormales;
        float valorHora;
        float horasExtras;
        Float sueldoBase;
        Float sueldoExtra;
        Float asignacion;
        Float deduccion;
        Float sueldoNeto;
        int hijos;

        System.out.println("Bienvenido al calculador de salario neto. Por favor, ingrese los siguientes datos.");
        nombre = System.console().readLine("Ingrese el nombre del trabajador: ");
        System.out.println("ingresa las horas normales:");
        horasNormales = Float.parseFloat(System.console().readLine());

        System.out.println("Ingresa el valor de la hora:");
        valorHora = Float.parseFloat(System.console().readLine());

        System.out.println("Ingresa las horas extras trabajadas:");
        horasExtras = Float.parseFloat(System.console().readLine());
        System.out.println("Ingresa el número de hijos:");
        hijos = Integer.parseInt(System.console().readLine());



        sueldoBase = (float) (horasNormales * valorHora);
        sueldoExtra = (float) (horasExtras * (valorHora * 0.25));
        asignacion = (float) (25000 + (17300 * hijos) + 18000);
        deduccion = (float) (sueldoBase * (0.05 + 0.02 + 0.07));
        sueldoNeto =(Float) (sueldoBase + sueldoExtra + asignacion - deduccion);

        System.out.println("Nombre del trabajador:" +nombre); 
        System.out.println("Asignacion: " + String.format("%.2f", asignacion));
        System.out.println("Deduccion: " + String.format("%.2f", deduccion));
        System.out.println("Sueldo neto del trabajador: " + String.format("%.2f", sueldoNeto));

    }    
}
