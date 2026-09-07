import java.util.Scanner;
public class OnceavoEjercicio {
    public static void main (String[] args){
        int categoria;
        double  sueldo;
        double porcentaje;
        double  aumento;
        double nuevoSueldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la categoria del trabajador");
        categoria = entrada.nextInt();
        System.out.println("ingrese el sueldo del trabajadador ");
        sueldo = entrada.nextDouble();

        switch (categoria) {
            case 1:
                porcentaje = 0.15;
                break;
            case 2:
                porcentaje = 0.10;
                break;
            case 3:
                porcentaje = 0.08;
                break;
            case 4:
                porcentaje = 0.07;
                break;
            default:
                porcentaje = 0;
                System.out.println("Categoria no valida.");
                break;
        }

            aumento = sueldo * porcentaje;
            nuevoSueldo = sueldo + aumento;

            System.out.println("Aumento: $" + aumento);
            System.out.println("Nuevo sueldo: $" + nuevoSueldo);

            entrada.close();

    }
}
