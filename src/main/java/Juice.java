public class Juice extends Drink{
    private Juice(int strengthPercentage) {
        super(strengthPercentage);
    }
    protected Juice() {
        this(0);
    }

    @Override
    public void drink() {

    }
}
