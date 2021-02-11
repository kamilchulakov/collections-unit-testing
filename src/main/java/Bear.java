import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bear extends Drink{
    private static final Logger logger = LogManager.getLogger(Bear.class);
    private Bear(int strengthPercentage) {
        super(strengthPercentage);
    }
    protected Bear() {
        this(20);
        setCapacity(2);
    }

    @Override
    public void drink() {
        logger.info("Checking drink capacity!");
        if (getCapacity() < 1) logger.warn("No bear left :(");
        else {
            logger.info("DRINKING MY LOVELY BEAR!");
            setCapacity(getCapacity() - 1);
            logger.warn("Did I drink my bear?");
        }
    }
}
