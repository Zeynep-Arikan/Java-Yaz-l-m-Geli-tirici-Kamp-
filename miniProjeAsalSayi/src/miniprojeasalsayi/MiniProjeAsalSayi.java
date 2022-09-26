package miniprojeasalsayi;

public class MiniProjeAsalSayi {

    public static void main(String[] args) {
        
        int number = 1;
        int remainder = number % 2;
        boolean isPrime = true;
        
        if(number ==1){
            System.out.println("sayi asal değildir");
            return;
        }
        
        if(number<1){
            System.out.println("Geçersiz sayi");
        }
        
        for(int i=2;i<number;i++){
            if(number % i ==0){
                isPrime=false;
            }
           
        }
        if(isPrime){
            System.out.println("Sayi asaldır");
        }
        else{
            System.out.println("Sayi asal değildir");}
    }
    
}
