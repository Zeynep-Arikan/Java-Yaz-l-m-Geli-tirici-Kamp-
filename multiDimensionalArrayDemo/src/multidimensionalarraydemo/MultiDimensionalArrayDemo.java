/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarraydemo;

/**
 *
 * @author CASPER
 */
public class MultiDimensionalArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String[] tek satırda oluşan array
        // String[][] hem satır hemde sütundan oluşan array
        String[][] sehirler = new String [3][3];
        
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Nevşehir";
        sehirler[2][0]="Diyarbakır";
        sehirler[2][1]="ŞanlıUrfa";
        sehirler[2][2]="Gaziantep";
        
        for(int i =0; i<=2;i++){ //satırları geziyor
            System.out.println("-----------------");
            for(int j=0;j<=2;j++){ //sütunları geziyor
                System.out.println(sehirler[i][j]); 
           }
            
        }
    }
    
}
