package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        //Logging
        //Authentication
        //Authorization
        //sanitize the data
        System.out.println("Checkout Method from ShoppingCart called");
    }

    public int quantity(){
        System.out.println("quamtity method called");
        return 2;
    }
}
