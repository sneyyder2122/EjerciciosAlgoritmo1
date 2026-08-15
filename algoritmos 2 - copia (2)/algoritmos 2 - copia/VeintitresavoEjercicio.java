public class VeintitresavoEjercicio {
public static void main(String[] args) {

        int bultos;
        int cajas;
        float kilosHarina;
        float litrosAceite;
        float precioBulto;
        float precioCaja;
        float precioHarina;
        float precioAceite;
        float sobranteHarina;
        float sobranteAceite;
        float ingresoHarina;
        float ingresoAceite;
        float ingresoTotal;
        System.out.println("Bienvenido al programa para calcular los ingresos. Porfavor, ingrese los siguientes datos ");
        System.out.println("ingresa la cantidad de kilos de harina:");
        kilosHarina = Float.parseFloat(System.console().readLine());
        System.out.println("ingresa la cantidad de litros de aceite:");
        litrosAceite = Float.parseFloat(System.console().readLine());
        System.out.println("ingresa el valor del bulto:");
        precioBulto = Float.parseFloat(System.console().readLine());
        System.out.println("ingresa el valor de la caja:");
        precioCaja = Float.parseFloat(System.console().readLine());
        System.out.println("ingresa el valor de la harina al detal:");
        precioHarina = Float.parseFloat(System.console().readLine());
        System.out.println("ingresa el valor del aceite al detal:");
        precioAceite = Float.parseFloat(System.console().readLine());

        bultos = (int) (kilosHarina / 24);
        cajas = (int) (litrosAceite / 15);
        sobranteHarina = kilosHarina % 24;
        sobranteAceite = litrosAceite % 15;
        ingresoHarina = (bultos * precioBulto) + (sobranteHarina * precioHarina);
        ingresoAceite = (cajas * precioCaja) + (sobranteAceite * precioAceite);
        ingresoTotal = ingresoHarina + ingresoAceite;

        System.out.println("Ingreso por harina: " + ingresoHarina);
        System.out.println("Ingreso por aceite: " + ingresoAceite);
        System.out.println("Ingreso total: " + ingresoTotal);
}
}
