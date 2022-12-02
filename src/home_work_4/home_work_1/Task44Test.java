package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task44.bytesKilobytes;


public class Task44Test {

    @Test
    public void kbCheck() {
        Assertions.assertEquals("4556 B равно 4.44921875 KB.", bytesKilobytes(1, 4556));
    }

    @Test
    public void bCheck() {
        Assertions.assertEquals("4 KB равно 4096.0 B.", bytesKilobytes(2, 4));
    }

    @Test
    public void otherCheck() {
        Assertions.assertEquals("Вы выбрали неправильную опцию, попробуйте снова.", bytesKilobytes(3, 4));
    }

    @Test
    public void negativeCheck() {
        Assertions.assertEquals("Вы выбрали неправильную опцию, попробуйте снова.", bytesKilobytes(1, -4));
    }

}
