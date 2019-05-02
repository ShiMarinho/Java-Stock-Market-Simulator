package company;

/*
 * TechFactory class implements AbstractFactory and create only Companies
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


    @Override
    public Company createCompany() {
        return new Tech.TechBuilder(compId, share, price).build();
    }

}
