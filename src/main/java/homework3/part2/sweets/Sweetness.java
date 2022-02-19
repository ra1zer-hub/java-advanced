package homework3.part2.sweets;

/**
 * @author Artamonov Aleksandr
 */

public abstract class Sweetness {
    private String name;
    private int weight;
    private double price;

    public Sweetness(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "название: " + name + ", вес: " + weight + ", цена: " + price;
    }
}
