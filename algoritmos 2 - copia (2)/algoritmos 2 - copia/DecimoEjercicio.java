

public class DecimoEjercicio {
    public static void main(String[] args) {
        float Chelines;
        float Dracmas;
        float Pesetas;
        float PesetasChelines;     
        float Francos; 
        float Liras; 
        float Dolares;

        System.out.println("Bienvenido al conversor de monedas. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese la cantidad de chelines: ");
        Chelines = Float.parseFloat(System.console().readLine());
        PesetasChelines = (float) (Chelines * 956.871) / 100;
        System.out.println("La cantidad de pesetas es: " + String.format("%.2f", PesetasChelines));

        System.out.println("ingrese la cantidad de dracmas: ");
        Dracmas = Float.parseFloat(System.console().readLine());
        Francos = (float) (Dracmas * 20.110) / 100;
        System.out.println("La cantidad de francos es: " + String.format("%.2f", Francos));

        System.out.println("Ingrese la cantidad de pesetas: ");
        Pesetas = Float.parseFloat(System.console().readLine());

        Dolares = (float) (Pesetas / 122.499 );


         Liras =  (float) ((float) (Pesetas * 100) / 9.289) ; 
        
            System.out.println("La cantidad de liras es: " + String.format("%.2f", Liras));
            System.out.println("La cantidad de dolares es: " + String.format("%.2f", Dolares));


    }
}
