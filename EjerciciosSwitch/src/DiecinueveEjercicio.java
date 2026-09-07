import java.util.Scanner;
public class DiecinueveEjercicio {
    public static void main (String[] args) {
        char sexo;
        int edad;
        int opcion;
        double nivelHomoglobina;
        double minimo;
        double maximo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su sexo ( M = mujer|| H = Hombre ): ");
        sexo = entrada.next().charAt(0);
        System.out.println("Ingrese su edad en meses: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese el nivel de hemoglobia");
        nivelHomoglobina = entrada.nextDouble();

        if (edad >= 0 && edad <= 1) {
            opcion = 1;
        } else if (edad > 1 && edad <= 6) {
            opcion = 2;
        } else if (edad > 6 && edad <= 12) {
            opcion = 3;
        } else if (edad > 12 && edad <= 60) {
            opcion = 4;
        } else if (edad > 60 && edad <= 120) {
            opcion = 5;
        } else if (edad > 120 && edad < 180) {
            opcion = 6;
        } else {
            opcion = 7;
        }

        switch (opcion) {
            case 1:
                minimo = 13;
                maximo = 26;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 2:
                minimo = 10;
                maximo = 18;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 3:
                minimo = 11;
                maximo = 15;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 4:
                minimo = 11.5;
                maximo = 15;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 5:
                minimo = 12.6;
                maximo = 15.5;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 6:
                minimo = 13;
                maximo = 15.5;
                System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                if (nivelHomoglobina < minimo) {
                    System.out.println("La persona tiene anemia.");
                } else {
                }
                if (nivelHomoglobina > maximo) {
                    System.out.println("la persona tiene eritrocitosis");
                } else {
                    System.out.println("la persona no tiene anemia ");
                }
                break;
            case 7:
                switch (sexo){
                    case 'M':
                    case 'm':
                        minimo = 12;
                        maximo = 16;
                        System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                        if (nivelHomoglobina < minimo) {
                            System.out.println("La persona tiene anemia.");
                        } else {
                        }
                        if (nivelHomoglobina > maximo) {
                            System.out.println("la persona tiene eritrocitosis");
                        } else {
                            System.out.println("la persona no tiene anemia ");
                        }
                        break;
                    case 'H':
                    case 'h':
                        minimo = 14;
                        maximo = 18;
                        System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

                        if (nivelHomoglobina < minimo) {
                            System.out.println("La persona tiene anemia.");
                        } else {
                        }
                        if (nivelHomoglobina > maximo) {
                            System.out.println("la persona tiene eritrocitosis");
                        } else {
                            System.out.println("la persona no tiene anemia ");
                        }
                        break;
                    default:
                        minimo = 0;
                        maximo = 0;
                        System.out.println("Sexo inválido.");

                }

        }
        entrada.close();
    }
}
