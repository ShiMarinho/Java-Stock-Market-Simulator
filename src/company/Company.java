/*
 * Generic company class.
 */
package company;

/**
 *
 * @author ms
 */
public abstract class Company{
    
    protected int compId;
    protected int share;
    protected double price;

    public int getId() {
        return compId;
    }

    public void setId(int id) {
        this.compId = id;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
  

    @Override
    public String toString() {
        return "Company{" + "id=" + compId + ", share=" + share + ", price=" + price + '}';
    }
    
}