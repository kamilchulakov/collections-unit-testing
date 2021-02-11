import org.junit.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CollectionFabricTest {
    private static final Logger logger = LogManager.getLogger(CollectionFabricTest.class);

    @Test
    public void testIsValidLinkedListOfDrinks() {
        CollectionFabric collectionFabric = new CollectionFabricImpl();
        LinkedList<Drink> drinkLinkedList = (LinkedList<Drink>) collectionFabric.makeCollection();
        assertNull(drinkLinkedList);
    }
}
