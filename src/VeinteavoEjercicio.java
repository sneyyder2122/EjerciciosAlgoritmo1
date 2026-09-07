import java.util.Scanner;
public class VeinteavoEjercicio {
    public static void main (String[] args){
        int opcion;
        double presupuesto;
        double presupuesto1;
        double insumos;
        double incentivos;
        double capital;
        double prestamo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese le capital de la empresa: ");
        capital = entrada.nextDouble();

        if (capital < 0 ){
            opcion = 1;
        }else if (capital <2000){
            opcion = 2;
        }else {
            opcion = 3;
        }

        switch (opcion){
            case 1:
                prestamo = 10000 - capital;
                presupuesto = capital + prestamo;
                presupuesto1 = presupuesto - 5000 - 2000;
                insumos = presupuesto1 / 2;
                incentivos = presupuesto1 /2;

                System.out.println("Cantidad a pedir al banco: $" + prestamo);
                System.out.println("Cantidad para compra de insumos: $" + insumos);
                System.out.println("Cantidad para incentivos al personal: $" + incentivos);
                break;
            case 2:
                prestamo = 20000 - capital;
                presupuesto = capital + prestamo;
                presupuesto1 = presupuesto - 5000 - 2000;
                insumos = presupuesto1 / 2;
                incentivos = presupuesto1 /2;

                System.out.println("Cantidad a pedir al banco: $" + prestamo);
                System.out.println("Cantidad para compra de insumos: $" + insumos);
                System.out.println("Cantidad para incentivos al personal: $" + incentivos);
            case 3:
                prestamo = 0;
                presupuesto = capital + prestamo;
                presupuesto1 = presupuesto - 5000 - 2000;
                insumos = presupuesto1 / 2;
                incentivos = presupuesto1 /2;
                System.out.println("no pedir prestamo ");
                System.out.println("Cantidad para compra de insumos: $" + insumos);
                System.out.println("Cantidad para incentivos al personal: $" + incentivos);
        }
        entrada.close();

    }
}
