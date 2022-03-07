package PizzaPackage;

/**
 *
 * @author dstones
 * 
 */
public class Pizza {

    //instance variables
    private String pizzaBase;
    private float price;

    
    //Constructors
    
    public Pizza(String pizzaBase, float price) {
        this.price = 0.0f;
        this.pizzaBase = pizzaBase;
    }
    
    
    public Pizza(String pizzaBase) {
        this.price =0.0f;
        this.pizzaBase = pizzaBase;
    }

    public Pizza() {
        this.price = 0.0f;
        this.pizzaBase="";
    }

    
    
    //setter and getter methods 
    
       
    public String getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(String pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    //Calculate price     
    
    public float calculatePrice() {
        
          //process pizza base combo box 
       if(pizzaBase.equalsIgnoreCase("Deep Dish") )
       {
            
           price = 10.00f;
       }
       else if (pizzaBase.equalsIgnoreCase("Gourmet Style") )
       {
            
           price = 12.00f;
       }
        else if (pizzaBase.equalsIgnoreCase("Thin & Crispy") )
       {
            
           price = 13.50f;
       }
       else {
            price = -1; // error 
       }  
       
        return price; 
        
    } //end calculatePrice 


    public String toString() {
        return "Pizza{" + "pizzaBase=" + pizzaBase + ", price=" + price + '}';
    }
    
    
    
} //end class 
