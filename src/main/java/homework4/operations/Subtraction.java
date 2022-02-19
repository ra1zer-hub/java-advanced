package homework4.operations;

/**
 * @author Artamonov Aleksandr
 */

public class Subtraction implements Action{
    @Override
    public double performAnOperation(double first, double second) {
        return first - second;
    }
}
