public class VeinteavoEjercicio {
    public static void main(String[] args) {
        double presupuesto;
        double presupuesto1;
        double insumos;
        double incentivos;
        double capital;
        double prestamo;

        System.out.println("Ingrese le capital de la empresa: ");
        capital = Double.parseDouble(System.console().readLine());

        if (capital < 0 ){
            prestamo = 10000 - capital;
        }else if (capital < 20000){
            prestamo = 20000 - capital;
        }else{
            prestamo = 0;
            System.out.println("no pedir prestamo ");
        }

        presupuesto = capital + prestamo;
        presupuesto1 = presupuesto - 5000 - 2000;
        insumos = presupuesto1 / 2;
        incentivos = presupuesto1 /2;
        
        System.out.println("Cantidad a pedir al banco: $" + prestamo);
        System.out.println("Cantidad para compra de insumos: $" + insumos);
        System.out.println("Cantidad para incentivos al personal: $" + incentivos);
    }
}
