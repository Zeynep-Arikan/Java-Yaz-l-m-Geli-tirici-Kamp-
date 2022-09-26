/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkadassayilar;
public class ArkadasSayilar {
// kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan sayilardir
    public static void main(String[] args) {
        // bilinen en küçük 220-284 
        int sayi1=220;
        int sayi2 = 284;
        int toplam1=0;
        int toplam2=0;
        
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }

        }
        
        for (int i = 1; i < sayi2; i++) {
            if(sayi2%i ==0){
                toplam2 = toplam2+i;
            }
            
        }
        if(sayi1==toplam2 && sayi2 == toplam1){
            System.out.println("bu iki sayi arkadaştır");
        }
        else{
            System.out.println("Bu iki sayi arkadaş değildir");}
        
    }
    
}
