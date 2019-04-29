/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author ms
 */
public class FoodBeverage extends Company{
    
    /*
     * Constructor
     */
    public FoodBeverage(FoodBeverageBuilder builder) {
        this.compId = builder.compId;
        this.price = builder.price;
        this.share = builder.share;

    }

    @Override
    public String toString() {

        return "\n Food and Beverage " + 
        		"\n ID: " + compId + 
        		"\n Share: " + share + 
        		"\n Price: " + price +
        		"\n Number of Shares sold: " + sharesSold;
    }
    
    public static class FoodBeverageBuilder {

        protected int compId;
        protected double price;
        protected int share;
       
        
        public FoodBeverageBuilder(int compId, int share, double price){
            this.compId = compId;
            this.share = share;
            this.price = price;
          
            
        }
        public FoodBeverage build(){
            return new FoodBeverage(this);
        }

    }
}
