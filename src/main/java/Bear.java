public class Bear extends Drink{
    private Bear(int strengthPercentage) {
        super(strengthPercentage);
    }
    protected Bear() {
        this(20);
    }

    @Override
    public void drink() {

    }
}
