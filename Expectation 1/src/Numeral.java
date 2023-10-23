import  java.util.List;
import java.lang.Math;
public class Numeral extends Expression {
    private double value;

    public Numeral() {};

    public Numeral(double value) {
        this.value = value;
    }

    public String toString() {
        return "(" + this.value +")";
    }

    public double evaluate() {
        return this.value;
    }
}
