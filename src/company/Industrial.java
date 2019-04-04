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
public class Industrial extends Company {

    /*
     * Constructor
     */
    public Industrial(IndustrialBuilder builder) {
        this.compId = builder.compId;
        this.price = builder.price;
        this.share = builder.share;

    }

    @Override
    public String toString() {
        return "Industrial{" + "id=" + compId + ", share=" + share + ", price=" + price + '}';
    }
    
    public static class IndustrialBuilder {

        protected int compId;
        protected double price;
        protected int share;
       
        
        public IndustrialBuilder(int compId, int share, double price){
            this.compId = compId;
            this.share = share;
            this.price = price;
          
            
        }
        public Industrial build(){
            return new Industrial(this);
        }

    }

}
