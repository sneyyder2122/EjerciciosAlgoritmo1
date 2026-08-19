public class SegundoEjercicio {
    public static void main(String[] args) {
    
        double SueldoTrabajador;
        double Aumento; 
        double Contrario;
        double PorcentajeAumento = 0.15;
        double porcentajeContrario = 0.12;
        double SueldoTotal;
        System.out.println("Bienvenido al programa para calcular el aumento del sueldo. por favor, ingrese los siguentes datos. ");
        System.out.println("\n ingrese el sueldo del trabajador");
        SueldoTrabajador = Double.parseDouble(System.console().readLine());

        if (SueldoTrabajador < 40000) {
        Aumento = SueldoTrabajador * PorcentajeAumento;
        SueldoTotal = SueldoTrabajador + Aumento ;
        System.out.println("El aumento aplicado es de " +Aumento);
        System.out.println("El sueldo total del trabajador es" +SueldoTotal);
        } 
        else  {
            Contrario = SueldoTrabajador * porcentajeContrario;
            System.out.println("el aumento aplicado es " +Contrario);
            SueldoTotal = SueldoTrabajador +  Contrario;
            System.out.println("el sueldo total es " +SueldoTotal);
        }
        } 
        
        }              

