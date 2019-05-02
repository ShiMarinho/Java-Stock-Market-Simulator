/*
 * Industrial is a type of a Company
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

        return "\n Industrial " + 
        		"\n ID: " + compId + 
        		"\n Share: " + share + 
        		"\n Price: " + price +
        		"\n Number of Shares sold: " + sharesSold;

    

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
