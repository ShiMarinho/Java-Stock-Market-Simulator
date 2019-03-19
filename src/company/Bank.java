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
        this.price = price;
        this.share = share;

    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + compId + ", share=" + share + ", price=" + price + '}';
    }
}
