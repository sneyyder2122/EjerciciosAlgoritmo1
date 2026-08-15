
public class TreceavoEjercicio {
public static void main(String[] args) {

        int billetes50000;
        int billetes20000;
        int billetes10000;
        int billetes5000;
        int billetes2000;
        int billetes1000;
        int billetes500;
        int billetes100;
        int totalDinero;

        System.out.println("Bienvenido al programa de conteo de dinero en el banco.");
        System.out.println("Ingrese la cantidad de billetes de $50.000:");
        billetes50000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $20.000:");
        billetes20000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $10.000:");
        billetes10000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $5.000:");
        billetes5000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $2.000:");
        billetes2000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $1.000:");
        billetes1000 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $500:");
        billetes500 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la cantidad de billetes de $100:");
        billetes100 = Integer.parseInt(System.console().readLine());
        totalDinero = (billetes50000 * 50000) + (billetes20000 * 20000) + (billetes10000 * 10000) + (billetes5000 * 5000) + (billetes2000 * 2000) + (billetes1000 * 1000) + (billetes500 * 500) + (billetes100 * 100);
        System.out.println("El dinero total que hay en el banco es: $" + totalDinero);

    }

    
}
