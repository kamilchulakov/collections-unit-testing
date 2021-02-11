public class Wine extends Drink{
    private Wine(int strengthPercentage) {
        super(strengthPercentage);
    }
    protected Wine() {
        this(10);
        setCapacity(8);
    }

    @Override
    public void drink() {

    }
}
