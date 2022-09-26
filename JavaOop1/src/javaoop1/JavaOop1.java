
package javaoop1;

public class JavaOop1 {

    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.setName("Delonghi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(6000);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        
        
        Product product2 = new Product();
        
        product2.setName("Smag kahve makinesi");
        product2.setDiscount(4);
        product2.setUnitPrice(8000);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");
               
        Product product3 = new Product();
        
        product3.setName("Tchibo kahve makinesi");
        product3.setDiscount(3);
        product3.setUnitPrice(4500);
        product3.setUnitsInStock(5);
        product3.setImageUrl("image3.jpg");

        Product[] products ={product1,product2,product3};
        
        
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>"+product.getName()+"</li>");
            
        }
        System.out.println("</ul>");
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("322435");
        individualCustomer.setCustomerNumber("12342");
        individualCustomer.setFirstName("zeynep");
        individualCustomer.setLastName("arıkan");
        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("bilgisayar");
        corporateCustomer.setPhone("344567");
        corporateCustomer.setTaxNumber("3421");
        
        Customer[] customers = {individualCustomer,corporateCustomer};
 
    }
    
}
