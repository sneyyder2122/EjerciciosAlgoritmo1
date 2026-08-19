    public class DieciochoavoEjercicio {
        public static void main(String[] args) {
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
            
            
            System.out.println("Ingrese el numero de hectarias");
            hectarias = Integer.parseInt(System.console().readLine());

            Superficie = hectarias * 10000;

            if (Superficie > 1000000){
            porcentajePino =(float) 0.70;
            porcentajeOyamel = (float) 0.20;
            porcentajeCedro = (float) 0.10; 
            }else {
                porcentajePino = (float) 0.50;
                porcentajeOyamel = (float) 0.30;
                porcentajeCedro = (float) 0.20;
            }
            areaPino = Superficie * porcentajePino;
            areaOyamel = Superficie * porcentajeOyamel;
            areaCedro = Superficie * porcentajeCedro;

            pino = (areaPino / 10) * 8;
            oyamel = (areaOyamel / 15) * 15;
            cedro = (areaCedro / 18) * 10;

            System.out.println("los pinos "+ pino);
            System.out.printf("los oyamel "+ oyamel);
            System.out.printf("los cedros "+ cedro);
        }
    }
