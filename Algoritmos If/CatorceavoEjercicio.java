public class CatorceavoEjercicio {
    public static void main(String[] args) {
        
    
    int a;
    int b;
    int c;
    double s;
    double area;

    System.out.println("Ingrese el lado A:");
    a = Integer.parseInt(System.console().readLine());
    System.out.println("Ingrese le lado B");
    b = Integer.parseInt(System.console().readLine());
    System.out.println("Ingrese el lado C");
    c = Integer.parseInt(System.console().readLine());
    
    if (a + b > c && a + c > b && b + c > a ) {
        System.out.println("los datos corresponden a un triangulo.");
        if ( a== b && b == c ) {
            System.out.println("los datos corresponden a un triangulo equilatero.");
        
        }else if (a == b || b == c || a == c) {
            System.out.println("Los datos corresponden a un triangulo isoseles.");
        }else {
            System.out.println("Los datos corresponden a un triangulo escaleno.");
        }   
        s = (a+b+c )/2.0;
        area = Math.sqrt(s*(s - a)*(s - b)*(s-c));
        System.out.printf("El area del triangulo es: %.3f%n", area);
    }else{
        System.out.println("Los datos ingresados no corresponden a un triangulo.");
    }

}
}  
