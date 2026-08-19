public class DoceavoEjercicio {
    public static void main(String[] args) {
            double temperatura;
            
            System.out.println("ingrese la tempera tura en grado fahrenheit");
            temperatura = Double.parseDouble(System.console().readLine());

            if (temperatura > 85){
                System.out.println("El deporte apropiado es: Natacion. ");
    }else if (temperatura > 70 && temperatura < 85) {
                System.out.println("El deporte apropiado es: Tenis. ");
    }else if (temperatura > 32 && temperatura < 70){
                System.out.println("El deporte apropiado es: Golf. ");
    }else if(temperatura > 10 && temperatura < 32){
                System.out.println("El deporte apropiado es: Esqui. ");
    }else if (temperatura <= 10){
                System.out.println("El deporte apropiado es: Marcha. ");

    }
}
}