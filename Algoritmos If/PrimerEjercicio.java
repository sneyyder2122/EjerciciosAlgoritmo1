public class PrimerEjercicio {
    public static void main(String[] args) {
        int numero; 
        
        System.out.println("Bienvenido al programa para saber si el numero es positivo o negativo. Por favor, digite el siguiente dato.");
        
        System.out.println("\n Digite el numero a calcular");
        numero = Integer.parseInt(System.console().readLine());
        
        System.out.println("El numero ingresado es:" + numero);
        if(numero > 0){
            System.out.println("El numero es positivo");
        }
        else if (numero < 0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es cero");
        }
    }

    
    }


