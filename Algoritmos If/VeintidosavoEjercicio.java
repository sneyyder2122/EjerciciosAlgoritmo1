public class VeintidosavoEjercicio {
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        double D;
        double x1;
        double x2;

        System.out.println("ingrese el valor de A");
        A = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de B");
        B = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de C");
        C = Double.parseDouble(System.console().readLine());

        D =  B * B - 4 * A * C; 
        System.out.println("la discriminante es "+ D);

        if (D == 0) {
            x1= -B/ (2*A);
            System.out.println("el valor de x1 es " +x1);
        }else if (D > 0){
            x1 = (-B + Math.sqrt(D))/ (2 * A); 
            x2 = (-B - Math.sqrt(D))/ (2 * A);
            System.out.println("el valor de x1 es " +x1);
            System.out.println("el valor de x2 es " +x2);

        }else {
            System.out.println("No existe una solucion real. ");
        }

    
    
    
    
    }
}
