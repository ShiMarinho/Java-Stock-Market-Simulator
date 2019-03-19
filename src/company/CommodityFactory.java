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
public class CommodityFactory implements AbstractFactory {

    private int compId;
    private int share;
    private double price;

    public CommodityFactory(int compId, int share, double price) {
        this.compId = compId;
        this.price = price;
        this.share = share;

    }

    @Override
    public Company createCompany() {
        return new Commodity(compId, share, price);
    }

}
