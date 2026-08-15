public class SextoEjercicio {
    public static void main(String[] args) {
        int hombres, Mujeres,GrupoEstudiantes;
        double porcentajeHombres, porcentajeMujeres;
        System.out.println("Bienvenido al calculador de porcentaje de hombres y mujeres en un grupo de estudiantes. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese el numero de hombres en el grupo de estudiantes: ");    
        hombres = Integer.parseInt(System.console().readLine());    
        System.out.println("Ingrese el numero de mujeres en el grupo de estudiantes: ");    
        Mujeres = Integer.parseInt(System.console().readLine());    
        GrupoEstudiantes = hombres + Mujeres;
        System.out.println("El numero total de estudiantes en el grupo es: " + GrupoEstudiantes);
        porcentajeHombres = (double) (hombres / GrupoEstudiantes) * 100;
        porcentajeMujeres = (double) (Mujeres / GrupoEstudiantes) * 100;
        System.out.println("El porcentaje de hombres en el grupo es: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres en el grupo es: " + porcentajeMujeres + "%");

    }
}
