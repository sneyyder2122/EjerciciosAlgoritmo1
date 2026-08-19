public class septimoEjercicio {
    public static void main(String[] args) {
        int A, B, C, D, N;

        System.out.println("Ingresa el valor de A");
        A= Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de B");
        B= Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de C");
        C= Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de D");
        D= Integer.parseInt(System.console().readLine());
        N= A*1000 + B*100 + C*10 + D;
        System.out.println("El numero es: "+N);
        
        if (C<5) {
            int N1 = A*1000 + B*100 + C*0 + D*0;
            System.out.println("Si redondeamos, N=: "+N1);
        } else {
            int N2 = A*1000 + (B+1)*100 + C*0 + D*0;
            System.out.println("Si redondeamos, N=: "+N2);
        }
    }
}