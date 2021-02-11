public abstract class Drink {
    private int strengthPercentage; // [0; 100]
    protected Drink(int strengthPercentage) {
        setStrengthPercentage(strengthPercentage);
    }

    public int getStrengthPercentage() {
        return strengthPercentage;
    }

    public void setStrengthPercentage(int strengthPercentage) {
        this.strengthPercentage = strengthPercentage;
    }

    public abstract void drink();
}
