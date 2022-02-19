package homework3.part2.sweets;

/**
 * @author Artamonov Aleksandr
 */

public class Cookies extends Sweetness{

    private String filling;

    public Cookies(String name, int weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cookies {" + super.toString() + ", начинка: " + filling + "}";
    }
}
