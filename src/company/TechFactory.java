package company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ms
 */
public class TechFactory implements AbstractFactory {

    private int compId;
    private int share;
    private double price;

    public TechFactory(int compId, int share, double price) {
        this.compId = compId;
        this.price = price;
        this.share = share;

    }

    public TechFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public Company createCompany() {
        return new Tech.TechBuilder(compId, share, price).build();
    }

}
