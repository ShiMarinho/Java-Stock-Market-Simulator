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
    public Bank(BankBuilder builder) {
        this.compId = builder.compId;
        this.price = builder.price;
        this.share = builder.share;

    }

    @Override
    public String toString() {

        return "\n Bank "
                + "\n ID: " + compId
                + "\n Share: " + share
                + "\n Price: " + price
                + "\n Number of Shares sold: " + sharesSold;

    }

    public static class BankBuilder {

        protected int compId;
        protected double price;
        protected int share;

        public BankBuilder(int compId, int share, double price) {
            this.compId = compId;
            this.share = share;
            this.price = price;

        }

        public Bank build() {
            return new Bank(this);
        }

    }
}
