/*
 * Bank is a type of a Company
 */
package company;

/**
 *
 * @author ms
 */
public class Bank extends Company {
	

    /*
     * Constructor
     */
    public Bank(int compId, int share, double price) {
        this.compId = compId;
        this.share = share;
        this.price = price;
        
  

    }
  

    @Override
    public String toString() {
        return "\n Bank " + 
        		"\n ID: " + compId + 
        		"\n Share: " + share + 
        		"\n Price: " + price ;
    }
}
