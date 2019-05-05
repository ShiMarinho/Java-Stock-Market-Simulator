/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author ms
 */
public class Commodity extends Company {
	DecimalFormat df = new DecimalFormat("#.##"); 

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

        return "\n COMPANY:  " + "\n Comodity: "
                + "\n ID: " + compId
                + "\n Share: " + share
                + "\n Price: " + df.format(price)
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
