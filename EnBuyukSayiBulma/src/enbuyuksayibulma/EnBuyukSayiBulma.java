/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enbuyuksayibulma;

/**
 *
 * @author CASPER
 */
public class EnBuyukSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi1 = 30;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk= sayi1;
        
        if(enBuyuk < sayi2){
            enBuyuk = sayi2;
            }
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük Sayı: " + enBuyuk);
    }
    
}
