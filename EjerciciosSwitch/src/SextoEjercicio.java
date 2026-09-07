import java.util.Scanner;
public class SextoEjercicio {
    public static void main (String[] args){
        double venta1;
        double venta2;
        double venta3;
        double total;
        double limite;
        double salario;
        double extra;
        double pago1;
        double pago2;
        double pago3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1:");
        venta1 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2:");
        venta2 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3:");
        venta3 = entrada.nextDouble();

        System.out.println("Ingrese el salario mensual:");
        salario = entrada.nextDouble();

        total = venta1 + venta2 + venta3;

        limite = total * 0.33;
        extra = salario * 0.20;

        switch (Double.compare(venta1, limite)){
            case 1:{
                pago1 = extra + salario;
            }break;
            default:{
                pago1 = salario;
            }break;
        }
        switch (Double.compare(venta2, limite)){
            case 1:{
                pago2 = extra + salario;
            }break;
            default:{
                pago2 = salario;
            }break;
        }
        switch (Double.compare(venta3,limite)){
            case 1:{
                pago3 = extra + salario;
            }break;
            default:{
                pago3 = salario;
            }break;
        }
        System.out.println("Ventas totales $ "+total);
        System.out.println("El 33% de las ventas totales es "+limite);

        System.out.println("El departamento 1 recibe "+pago1);
        System.out.println("El departamento 2 recibe "+pago2);
        System.out.println("El departamento 3 recibe "+pago3);
        entrada.close();
    }
}
