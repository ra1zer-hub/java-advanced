package homework3.part2.sweets;

/**
 * @author Artamonov Aleksandr
 */

public class Candy extends Sweetness {

    private boolean nuts;

    public Candy(String name, int weight, double price, boolean nuts) {
        super(name, weight, price);
        this.nuts = nuts;
    }

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return "Candy {" + super.toString() + ", орехи: " + nuts + "}";
    }
}
