/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2022;

/**
 *
 * @author CASPER
 */
public class Java2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        
        double dolarDun=18.40;
        double dolarBugun = 18.40;
        
        boolean dollarDustuMu= false;
        
        //koşul şart blokları
        if (dolarBugun<dolarDun) {
            String okYonu = "down.svg";
            System.out.println(okYonu);
            
        }else if(dolarBugun>dolarDun){
            String okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            String okYonu = "equal.svg";
            System.out.println(okYonu);

        }
    }
    
}
