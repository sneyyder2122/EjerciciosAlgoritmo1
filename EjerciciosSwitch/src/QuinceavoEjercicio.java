import java.util.Scanner;
public class QuinceavoEjercicio {
    public static void main(String[] args) {
        int mes;
        int dia;
        int año;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuál es su mes de nacimiento?");
        mes=entrada.nextInt();
        System.out.println("¿Cuál es su dia de nacimiento?");
        dia=entrada.nextInt();
        System.out.println("¿Cuál es su año de nacimiento?");
        año=entrada.nextInt();

        edad= 2026 -año;


        switch (mes){
            case 1:
                if (dia <=20){
                    System.out.println("su signo es Capricornio");
                }else{
                    System.out.println("Su signo es Acuario");
                }
                break;
            case 2:
                if (dia <=19){
                    System.out.println("Su signo es Acuario");
                }else {
                    System.out.println("Su signo es Piscis");
                }
                break;
            case 3:
                if (dia <=19){
                    System.out.println("Su signo es Piscis");
                }else {
                    System.out.println("Su signo es Aries");
                }
                break;
            case 4:
                if (dia <=20){
                    System.out.println("Su signo es Aries");
                }else {
                    System.out.println("Su signo es Tauro");
                }
                break;
            case 5:
                if (dia<=21){
                    System.out.println("Su signo es Tauro");
                }else {
                    System.out.println("Su signo es Geminis");
                }
                break;
            case 6:
                if (dia<=21){
                    System.out.println("Su signo es Geminis");
                }else{
                    System.out.println("Su sino es cancer");
                }
                break;
            case 7:
                if (dia<=22){
                    System.out.println("Su signo es Cancer");
                }else {
                    System.out.println("Su signo es Leo");
                }
                break;
            case 8:
                if (dia<= 23){
                    System.out.println("Su signo es Leo");
                }else{
                    System.out.println("Su signo es Virgo");
                }
                break;
            case 9:
                if(dia<=22){
                    System.out.println("Su signo es Virgo");
                }else{
                    System.out.println("Su signo es Libra");
                }
                break;
            case 10:
                if (dia<22){
                    System.out.println("Su signo es Libra");
                }else{
                    System.out.println("Su signo es Escorpio");
                }
                break;
            case 11:
                if (dia<21){
                    System.out.println("Su signo es Escorpio");
                }else {
                    System.out.println("Su signo es Sagitario");
                }
                break;
            case 12:
                if (dia <=21){
                    System.out.println("Su signo es Sagitario");
                }else{
                    System.out.println("Su signo es Capricornio");
                }
                break;
            default:
                System.out.println("Mes no valido");
        }
        System.out.println("La edad es "+edad);
        entrada.close();
   }
}
