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
public class Commodity extends Company {


    /*
     * Constructor
     */
    public Commodity(int compId, int share, double price) {
        this.compId = compId;
        this.price = price;
        this.share = share;

    }

    @Override
    public String toString() {
        return "Commodity{" + "id=" + compId + ", share=" + share + ", price=" + price + '}';
    }
}
