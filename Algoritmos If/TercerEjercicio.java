public class TercerEjercicio {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double resultado;

        System.out.println("Ingrese valor de a");
        a=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese  valor de  b");
        b=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de c");
        c=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de d");
        d= Double.parseDouble(System.console().readLine());

    if (d == 0) {

    resultado = Math.pow(a - c, 2);
    System.out.println("El resultado es: " + resultado);

} else if (d > 0) {

    resultado = Math.pow(a - b, 3) / d;
    System.out.println("El resultado es: " + resultado);

} else {

    System.out.println("d debe ser mayor o igual a 0.");
}
    }
    }
    
