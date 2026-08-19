import java.util.Scanner;

public class QuinceavoEjercicio {
    public static void main(String[] args){
        int mes, dia, año;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("¿Cuál es su mes de nacimiento?");
            mes = entrada.nextInt();
            System.out.println("¿Cuál es su dia de nacimiento?");
            dia = entrada.nextInt();
            System.out.println("¿Cuál es su año de nacimiento?");
            año = entrada.nextInt();
            
            int añoActual = 2026;
            int mesActual = 8;
            int diaActual = 14;
            
            if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || año > añoActual) {
                System.out.println("La fecha de nacimiento no es válida.");
                entrada.close();
                return;
            }
            
            int edad = añoActual - año;
            if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
                edad--;
            }
            System.out.println("Su edad es: " + edad);
            
            if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Su signo del zodiaco es sagitario");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
                System.out.println("Su signo del zodiaco es capricornio");
            } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
                System.out.println("Su signo del zodiaco es acuario");
            } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 19)) {
                System.out.println("Su signo del zodiaco es piscis");
            } else if ((mes == 3 && dia >= 20) || (mes == 4 && dia <= 20)) {
                System.out.println("Su signo del zodiaco es aries");
            } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
                System.out.println("Su signo del zodiaco es tauro");
            } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
                System.out.println("Su signo del zodiaco es geminis");
            } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
                System.out.println("Su signo del zodiaco es cancer");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
                System.out.println("Su signo del zodiaco es leo");
            } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
                System.out.println("Su signo del zodiaco es virgo");
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Su signo del zodiaco es libra");
            } else {
                System.out.println("Su signo del zodiaco es escorpio");
            }
        }
    }
}

