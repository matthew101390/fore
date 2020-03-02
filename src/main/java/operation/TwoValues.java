package operation;
public class TwoValues {

    private int a;
    private int b;

    public TwoValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }
}
