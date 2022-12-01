package home_work_4.additional.objects;

import additional.objects.flowers.Bouquet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BouquetTest {
    Bouquet bouquet = new Bouquet();

    @Test
    public void testSpoiled() {
        Assertions.assertEquals("not spoiled", bouquet.spoiled());
    }
}
