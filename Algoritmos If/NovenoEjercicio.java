public class NovenoEjercicio {
    public static void main(String[] args) {
        int P; 
        int Q;
        double Resultado;

        System.out.println("Ingresa el valor de P");
        P = Integer.parseInt (System.console().readLine());
        System.out.println("Ingresa el valor de Q");
        Q = Integer.parseInt (System.console().readLine());
        
        Resultado = Math.pow(P, 3)+ Math.pow(Q, 4)- 2* Math.pow(P, 2);

        if (Resultado > 680) {
                System.out.println("los valores P y Q satisfacen la expresion ");
                System.out.println("P = " +P);
                System.out.println("Q = " +Q);
        }else{
            System.out.println("los valores ingresados no satisfacen la expresion");
        }

    }
}
