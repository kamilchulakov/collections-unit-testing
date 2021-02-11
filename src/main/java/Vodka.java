public class Vodka extends Drink{
    private Vodka(int strengthPercentage) {
        super(strengthPercentage);
    }
    protected Vodka() {
        this(40);
    }

    @Override
    public void drink() {

    }
}
