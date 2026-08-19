    public class CuartoEjercicio {
        public static void main(String[] args) {

            double valor1;
            double valor2;
            double valor3;
            
            double areaTriangulo;
            double areaCirculo;
            double areaRectangulo;

            System.out.println("Ingrese el valor 1:");
            valor1 = Double.parseDouble(System.console().readLine());

            System.out.println("Ingrese el valor 2:");
            valor2 = Double.parseDouble(System.console().readLine());

            System.out.println("Ingrese el valor 3:");
            valor3 = Double.parseDouble(System.console().readLine());

            areaTriangulo = (valor1 * valor2) / 2;
            areaCirculo = valor2 * Math.pow(valor1, 2);
            areaRectangulo = valor1 * valor2;

            if (areaTriangulo == valor3) {
                System.out.println("La figura es un triangulo.");
                System.out.printf("el area del triangulo es: %.3f%n", areaTriangulo);
            }

            else if (areaCirculo == valor3) {
                System.out.println("La figura es un circulo.");
                System.out.printf("el area del circulo es: %.3f%n", areaCirculo);
            }

            else if (areaRectangulo == valor3) {
                System.out.println("La figura es un rectangulo.");
                System.out.printf("el area del rectangulo es: %.3f%n", areaRectangulo);
            }

            else if (areaTriangulo != valor3 && areaCirculo != valor3 && areaRectangulo != valor3) {
                System.out.println("Los valores no corresponden a ninguna de las figuras.");
            }
        }
    }
        
