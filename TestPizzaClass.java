/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PizzaPackage;


public class TestPizzaClass {

   
    public static void main(String[] args) {
        
        System.out.println(" **** Test Pizza Data **** \n");
        
        //Create Pizza One
        Pizza p1 = new Pizza();
        
        //Initialise properties
  
        p1.setPizzaBase("Deep Dish");
        p1.setPrice(0.0f);
        
        //Display Pizza One
        System.out.println("\nTest Pizza One:");
        System.out.println("Pizza Base:" +p1.getPizzaBase());
        System.out.println("Price: "+p1.getPrice());
        
         //Create Pizza Two
        Pizza p2 = new Pizza("Gourmet Style");
        
        //Calculate Price of Pizza Two
        p2.calculatePrice();
        
        
        //Display pizza Two
        System.out.println("\nTest Pizza Two:");
        System.out.println(p2.toString()+"\n\n");
        
        
        
        
    }
    
}
