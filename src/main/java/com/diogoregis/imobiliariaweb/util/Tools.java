package com.diogoregis.imobiliariaweb.util;

public class Tools {


    public static void pausa(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException("Não foi possivel acionar o Sleep");
        }
    }

}
