/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev1_2022;

/**
 *
 * @author CASPER
 */
public class Odev1_2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hello world
        System.out.println("Hello world");
        
        //Değişkenler
         int ogrenciSayisi=12;
         String mesaj ="Öğrenci Sayısı: " ;
         System.out.println(mesaj+ogrenciSayisi);
         
        //dataTypes
        int syi= 12;
        double sayi=12.5;
        sayi = -129;
        char karakter= 'A';
        boolean dogruMu = true;
        
        // if blocks(conditionals)
        int sayi2 = 20;
        if (sayi2<20) {
            System.out.println("sayi 20 den küçüktür");
           
        }
        else if(sayi2 == 20){
            System.out.println("sayi 20 ye eşittir");
        }
        else{
            System.out.println("sayi 20 den küçük değildir");
        }
        // switch blocks
        char grade= 'C';
        switch(grade){
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel geçtiniz");
                break;
            case 'C':
                System.out.println("İyi geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default :
                System.out.println("Geçersiz not girdiniz");
                      
        }
        //loops 
        //for loop
        for(int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("döngü bitti");
        // while loop
        int i = 2;
        while(i<10){
            System.out.println(i);
            i +=2;
            
        }
        System.out.println("While döngüsü bitti");
        // do-while
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While döngüsü bitti");
        
        // Arrays
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Zeynep";
        ogrenciler[2] = "Salih";
        
        for(int x=0;x<ogrenciler.length;x++){
            System.out.println(ogrenciler[x]);
        }
    }
    
    
}
