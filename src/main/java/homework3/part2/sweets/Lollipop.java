package homework3.part2.sweets;

/**
 * @author Artamonov Aleksandr
 */

public class Lollipop extends Sweetness{

    private String taste;

    public Lollipop(String name, int weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Lollipop {" + super.toString() + ", вкус: " + taste + "}";
    }
}
