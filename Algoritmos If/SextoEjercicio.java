public class SextoEjercicio {
    public static void main(String[] args) {

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

        System.out.println("Ingrese las ventas del departamento 1:");
        venta1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese las ventas del departamento 2:");
        venta2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese las ventas del departamento 3:");
        venta3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el salario mensual:");
        salario = Double.parseDouble(System.console().readLine());

        total = venta1 + venta2 + venta3;

        limite = total * 0.33;

        extra = salario * 0.20;

        if (venta1 > limite) {
            pago1 = salario + extra;
        } else {
            pago1 = salario;
        }

        if (venta2 > limite) {
            pago2 = salario + extra;
        } else {
            pago2 = salario;
        }

        if (venta3 > limite) {
            pago3 = salario + extra;
        } else {
            pago3 = salario;
        }

        System.out.println("Ventas totales: $" + total);
        System.out.println("Departamento 1 recibira: $" + pago1);
        System.out.println("Departamento 2 recibira: $" + pago2);
        System.out.println("Departamento 3 recibira: $" + pago3);
    }
}