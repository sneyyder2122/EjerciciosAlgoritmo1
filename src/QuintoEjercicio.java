import java.util.Scanner;
public class QuintoEjercicio {
    public static void main (String[] args){
        int TotalCompra ;
        double inversion = 55;
        double prestbancario = 30;
        double inversion2 = 70 ;
        double fab = 30;
        double intfab= 20;
        double pagoinv;
        double pagobanco;
        double pagofabric;
        double tasa1;
        double pagoinv2;
        double pagofabric2;
        double tasa2;
        Scanner entrada = new Scanner (System.in);

        System.out.println("ingrese el total a pagar");
        TotalCompra = entrada.nextInt();
        switch (Integer.compare(TotalCompra,500000)){
            case 0:{
                pagoinv = (TotalCompra*inversion)/100;
                pagobanco=(TotalCompra*prestbancario)/100;
                pagofabric=(TotalCompra*fab)/100;
                tasa1=(pagofabric*intfab)/100;

                System.out.println("El monto que paga la empresa es: "+pagoinv);
                System.out.println("El monto que presta el banco es de:"+pagobanco);
                System.out.println("El monto que presta el fabricante es de: " +pagofabric+" y la tasa de interes es de: " +tasa1);
                break;
            }
            default:{
                pagoinv2=(TotalCompra*inversion2)/100;
                pagofabric2=(TotalCompra*fab)/100;
                tasa2=(pagofabric2*intfab)/100;
                System.out.println("El monto que paga la empresa es: "+pagoinv2);
                System.out.println("El monto que presta el fabricante es de:"+pagofabric2+" y la tasa de interes es de:"+tasa2);
            }
        }
        entrada.close();
    }
}
