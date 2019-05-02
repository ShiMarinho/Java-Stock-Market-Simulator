/*
 * Tech is a type of a Company
 */
package company;

/**
 *
 * @author ms
 */
public class Tech extends Company {
    
    /*
     * Constructor
     */
    public Tech(TechBuilder builder) {
        this.compId = builder.compId;
        this.price = builder.price;
        this.share = builder.share;

    }

    @Override
    public String toString() {

        return "\n Tech " + 
        		"\n ID: " + compId + 
        		"\n Share: " + share + 
        		"\n Price: " + price + 
        		"\n Number of Shares sold: " + sharesSold;

    }
    
    public static class TechBuilder {

        protected int compId;
        protected double price;
        protected int share;
       
        
        public TechBuilder(int compId, int share, double price){
            this.compId = compId;
            this.share = share;
            this.price = price;
          
            
        }
        public Tech build(){
            return new Tech(this);
        }

    }
}
