package homework4.operations;

/**
 * @author Artamonov Aleksandr
 */

public class Division implements Action{
    @Override
    public double performAnOperation(double first, double second) {
        return first / second;
    }
}
