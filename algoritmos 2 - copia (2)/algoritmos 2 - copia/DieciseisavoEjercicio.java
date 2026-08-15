public class DieciseisavoEjercicio{
   public static void main(String[] args) {

        float largo = 4;
        float ancho = 1.5f;
        float areaLamina;
        float areaPieza;
        int piezas;
        float desperdicio;



        areaPieza = 0.5f;

        System.out.println("Bienvenido al calculador de y desperdicio de una lámina de metal");
        System.out.println("\n  datos de la lamina de metal: mide "+ largo + " de largo y " + ancho + " de ancho"); 
        System.out.println("consumo por pieza: " + areaPieza + " metros cuadrados" ); 

        System.out.println("\n resultados: ");
                areaLamina = largo * ancho;
        piezas = (int) (areaLamina / areaPieza); 
        desperdicio = areaLamina - (piezas * areaPieza);

        System.out.println("Piezas fabricadas: " + piezas);
        System.out.println("Desperdicio: " + desperdicio + " metros cuadrados");

    }    
}
