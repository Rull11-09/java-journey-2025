/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author morel
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        System.out.println("Welcome to Duke Choice Shop");
        
        Customer c1 = new Customer();
        
        c1.name="Pinky";
        
      
        System.out.println("The custumer is "+ c1.name);
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price       = 20.9;
        item1.size        = "M";

        item2.description = "Orange T‑Shirt";
        item2.price       = 10.5;
        item2.size        = "S";
        
        System.out.println(item1.description + ", " + item1.price + ", " + item1.size);
        System.out.println(item2.description + ", " + item2.price + ", " + item2.size);
        
        total =  (item1.price + item2.price *2 ) * (1 + tax);
        
        System.out.println("Total= " +total);

    }
    
}
