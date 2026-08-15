    import java.util.Scanner;

public class CatorceavoEjercicio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Bienvenido al sistema de ecuaciones lineales de dos variables");
            System.out.println("Ingrese el coeficiente a");
        System.out.print("a: ");
        float a = (float) sc.nextDouble();
        System.out.println("Ingrese el coeficiente b");
        System.out.print("b: ");
        float b = (float) sc.nextDouble();
        System.out.println("Ingrese el coeficiente c");
        System.out.print("c: ");
        float c = (float) sc.nextDouble();
        System.out.println("Ingrese el coeficiente d");
        System.out.print("d: ");
        float d = (float)  sc.nextDouble();
        System.out.println("Ingrese el coeficiente e");
        System.out.print("e: ");
        float e =(float) sc.nextDouble();
        System.out.println("Ingrese el coeficiente f");
        System.out.print("f: ");
        float f = (float) sc.nextDouble();

        Float x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        Float y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.println("X = " +  x);
        System.out.println("Y = " +  y)
        ;

        sc.close();
    }
}
}
