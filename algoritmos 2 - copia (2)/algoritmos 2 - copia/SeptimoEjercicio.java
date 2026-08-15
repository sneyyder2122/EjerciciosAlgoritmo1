public class SeptimoEjercicio {
    public static void main(String[] args) {
        float metros;
        float pulgadas;
        float pies;
        System.out.println("Bienvenido al calculador de conversion de metros a pulgadas y pies. Por favor, ingrese los siguientes datos.");
        System.out.println("Ingrese la cantidad en metros:");
        metros = Float.parseFloat(System.console().readLine());
        
         pulgadas =  (float) (metros * 39.27);
        pies = (float) (metros * 3.281);    

        System.out.println(metros + " metros equivalen a:");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(pies + " pies");
    }
}



