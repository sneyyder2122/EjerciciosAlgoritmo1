public class OnceavoEjercicio {
    public static void main(String[] args) {
        int categoria;
        double  sueldo;
        double porcentaje;
        double  aumento; 
        double nuevoSueldo;

        System.out.println("ingrese la categoria del trabajador");
        categoria = Integer.parseInt(System.console().readLine());
        System.out.println("ingrese el sueldo del trabajadador ");
        sueldo = Double.parseDouble(System.console().readLine());

        if (categoria == 1) {
            porcentaje = 0.15;
        } else {
            if (categoria == 2) {
                porcentaje = 0.10;
            } else {
                if (categoria == 3) {
                    porcentaje = 0.08;
                } else {
                    if (categoria == 4) {
                        porcentaje = 0.07;
                    } else {
                        porcentaje = 0;
                        System.out.println("categoria no valida ");
                    }
                }
            }
        }
        aumento = sueldo * porcentaje;
        nuevoSueldo = sueldo + aumento;
        System.out.println("Aumento: $" + aumento);
        System.out.println("Nuevo sueldo: $" + nuevoSueldo);
    }
    
}
