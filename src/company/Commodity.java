/*
 * Commodity is a type of a Company
 */
package company;

/**
 *
 * @author ms
 */
public class Commodity extends Company {

    /*
     * Constructor
     */
    public Commodity(CommodityBuilder builder) {
        this.compId = builder.compId;
        this.price = builder.price;
        this.share = builder.share;

    }

    @Override
    public String toString() {

        return "\n Comodity: "
                + "\n ID: " + compId
                + "\n Share: " + share
                + "\n Price: " + price
                + "\n Number of Shares sold: " + sharesSold;

    }

    public static class CommodityBuilder {

        protected int compId;
        protected double price;
        protected int share;

        public CommodityBuilder(int compId, int share, double price) {
            this.compId = compId;
            this.share = share;
            this.price = price;

        }

        public Commodity build() {
            return new Commodity(this);
        }

    }
}
