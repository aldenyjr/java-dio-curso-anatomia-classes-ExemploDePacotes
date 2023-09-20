package enums;

import java.util.ArrayList;

public class SistemaIbge {
    public static void main(String[] args) {
        for( EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.BAHIA;
        System.out.println(eb.getIbge());


    }
}
