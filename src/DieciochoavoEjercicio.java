import java.util.Scanner;
public class DieciochoavoEjercicio {
    public static void main (String[] args){
        int opcion;
        float Superficie;
        float hectarias;
        float pino;
        float oyamel;
        float cedro;
        float areaOyamel;
        float areaPino;
        float areaCedro;
        float porcentajePino;
        float porcentajeOyamel;
        float porcentajeCedro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de hectarias");
        hectarias = entrada.nextInt();
        Superficie = hectarias * 10000;
        if (hectarias<1000000){
            opcion= 1;
        }else {
            opcion =2;
        }
        switch (opcion){
            case 1:
                porcentajePino =(float) 0.70;
                porcentajeOyamel = (float) 0.20;
                porcentajeCedro = (float) 0.10;

                areaPino = Superficie * porcentajePino;
                areaOyamel = Superficie * porcentajeOyamel;
                areaCedro = Superficie * porcentajeCedro;

                pino = (areaPino / 10) * 8;
                oyamel = (areaOyamel / 15) * 15;
                cedro = (areaCedro / 18) * 10;

                System.out.println("los pinos "+ pino);
                System.out.println("los oyamel "+ oyamel);
                System.out.println("los cedros "+ cedro);
                break;
            case 2:
                porcentajePino = (float) 0.50;
                porcentajeOyamel = (float) 0.30;
                porcentajeCedro = (float) 0.20;
                areaPino = Superficie * porcentajePino;
                areaOyamel = Superficie * porcentajeOyamel;
                areaCedro = Superficie * porcentajeCedro;

                pino = (areaPino / 10) * 8;
                oyamel = (areaOyamel / 15) * 15;
                cedro = (areaCedro / 18) * 10;

                System.out.println("los pinos "+ pino);
                System.out.println("los oyamel "+ oyamel);
                System.out.println("los cedros "+ cedro);
                break;
        }
        entrada.close();
    }
}
