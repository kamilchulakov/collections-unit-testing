public abstract class Drink {
    private int strengthPercentage; // [0; 100]
    private int capacity; // litres
    protected Drink(int strengthPercentage) {
        setStrengthPercentage(strengthPercentage);
        setCapacity(1);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStrengthPercentage() {
        return strengthPercentage;
    }

    public void setStrengthPercentage(int strengthPercentage) {
        this.strengthPercentage = strengthPercentage;
    }

    public abstract void drink();
}
