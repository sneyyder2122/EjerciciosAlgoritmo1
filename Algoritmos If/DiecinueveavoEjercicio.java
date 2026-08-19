

public class DiecinueveavoEjercicio {
    public static void main(String[] args) {
        char sexo;
        int edad;
        double nivelHomoglobina;
        double minimo;
        double maximo;


        System.out.println("Ingrese su sexo ( M = mujer|| H = Hombre ): ");
        sexo = System.console().readLine().charAt(0);
        System.out.println("Ingrese su edad en meses: ");
        edad = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el nivel de hemoglobia");
        nivelHomoglobina = Double.parseDouble(System.console().readLine()); 

        if (edad == 0 && edad == 1 ) {
            minimo = 13;
            maximo = 26;
        }else if (edad > 1 && edad <= 6) {
            minimo = 10;
            maximo = 18;
        }else if (edad > 6 && edad <= 12){
            minimo = 11;
            maximo = 15;
        }else if (edad > 12 && edad <= 60 ){
            minimo = 11.5;
            maximo = 15;
        }else if (edad > 60 && edad <= 120){
            minimo = 12.6;
            maximo = 15.5;
        }else if (edad > 120 && edad <180){
            minimo = 13;
            maximo = 15.5;
        }else{
            if (sexo == 'M' ||sexo == 'm') {
                minimo = 12;
                maximo = 16;
            }else{
                minimo = 14;
                maximo = 18;
            }
        }
        
        System.out.println("Rango de hemoglobina: " + minimo + " - " + maximo + " g%");

        if (nivelHomoglobina < minimo) {
            System.out.println("La persona tiene anemia.");
        } else {
        }if ( nivelHomoglobina > maximo){
            System.out.println("la persona tiene eritrocitosis");
        }else{
            System.out.println("la persona no tiene anemia ");
        }
    } 
}
