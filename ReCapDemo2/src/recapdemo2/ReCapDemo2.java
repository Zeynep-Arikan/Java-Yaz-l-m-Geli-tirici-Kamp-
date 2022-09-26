/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recapdemo2;

/**
 *
 * @author CASPER
 */
public class ReCapDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] myList={1.2,1.3,4.3,5.6};
        double total = 0;
        double max = myList[0];
        for(double number:myList){
            if(max<number)
                max = number;
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam= " + total);
        System.out.println("En Buyuk sayi: "+ max);
    }
    
}
