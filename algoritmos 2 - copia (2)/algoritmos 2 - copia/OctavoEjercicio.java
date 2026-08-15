public class OctavoEjercicio {
    public static void main(String[] args) {
        float a, b, c, p,aux,area;
        System.out.println("Bienvenido al calculador de area de un triangulo. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese el valor del primer lado del triangulo: ");
        a = Float.parseFloat(System.console().readLine());  
        System.out.println("Ingrese el valor del segundo lado del triangulo: ");
        b = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el valor del tercer lado del triangulo: ");
        c = Float.parseFloat(System.console().readLine());
        p = (a + b + c) / 2;
        System.out.println("El semiperimetro del triangulo es: " + p);
        aux = p*(p-a) * (p-b) *(p-c);
        System.out.println("El resultado del area al cuadrado sin sacarle la raiz cuadrada es: " + aux);
        area = (float) Math.sqrt(aux);
        System.out.println("El area del triangulo es: " + area);

    }
}
