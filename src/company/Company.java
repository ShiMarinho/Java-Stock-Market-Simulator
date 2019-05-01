/*
 * Generic company class.
 */
package company;

/**
 *
 * @author ms
 */
public abstract class Company {

    protected int compId;
    protected int share;
    protected double price;
    protected int sharesSold;

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

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public int getSharesSold() {
        return sharesSold;
    }

    public void setSharesSold(int sharesSold) {
        this.sharesSold = sharesSold;
    }
    public void sellShare(){
       // create an array of 10 Companies and a counter to keep track of 10 share solds
       // if 10 share are sold increase 2% in the price of the company and start count again
    }
    @Override
    public String toString() {
        return "Company|" + compId + ", share:" + share + ", price:" + price + sharesSold + '\n';
    }

}
