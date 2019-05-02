/*
 * Industrial Factory class implements AbstractFactory and create only Companies 
 */
package company;

/**
 *
 * @author ms
 */
public class IndustrialFactory implements AbstractFactory {

    private int compId;
    private int share;
    private double price;

    public IndustrialFactory(int compId, int share, double price) {
        this.compId = compId;
        this.price = price;
        this.share = share;

    }

    @Override
    public Company createCompany() {
        return new Industrial.IndustrialBuilder(compId, share, price).build();
    }

    
}
