package home_work_4.home_work_5;

import home_work_5.DataContainer;
import home_work_5.api.ComparatorInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DataContainerTest {

    String[] dataFor411 = new String[]{"1", "2", "3", null, null, null};
    DataContainer<String> containerFor411 = new DataContainer<>(dataFor411);

    @Test
    public void testIsEmptyFor411() {
        Assertions.assertFalse(containerFor411.isEmpty());
    }

    @Test
    public void testSizeFor411() {
        Assertions.assertEquals(3, containerFor411.size());
    }

    @Test
    public void testAddFor411() {
        Assertions.assertEquals(3, containerFor411.add("777"));
    }

    @Test
    public void testGetFor411() {
        Assertions.assertEquals("1", containerFor411.get(0));
    }

    String[] dataFor412 = new String[]{"1", "2", "3", null, null, null};
    DataContainer<String> containerFor412 = new DataContainer<>(dataFor412);

    @Test
    public void testIsEmptyFor412() {
        Assertions.assertFalse(containerFor412.isEmpty());
    }

    @Test
    public void testSizeFor412() {
        Assertions.assertEquals(3, containerFor412.size());
    }

    @Test
    public void testAddFor412() {
        Assertions.assertEquals(-1, containerFor412.add(null));
    }

    @Test
    public void testGetFor412() {
        Assertions.assertEquals("3", containerFor412.get(2));
    }

    String[] dataFor413 = new String[]{"1", null, "3", null, null, null};
    DataContainer<String> containerFor413 = new DataContainer<>(dataFor413);

    @Test
    public void testIsEmptyFor413() {
        Assertions.assertFalse(containerFor413.isEmpty());
    }

    @Test
    public void testSizeFor413() {
        Assertions.assertEquals(2, containerFor413.size());
    }

    @Test
    public void testAddFor413() {
        Assertions.assertEquals(1, containerFor413.add("777"));
    }

    @Test
    public void testGetFor413() {
        Assertions.assertEquals("3", containerFor413.get(2));
    }

    String[] dataFor421 = new String[]{"1", "2", "3"};
    DataContainer<String> containerFor421 = new DataContainer<>(dataFor421);

    @Test
    public void testIsEmptyFor421() {
        Assertions.assertFalse(containerFor421.isEmpty());
    }

    @Test
    public void testSizeFor421() {
        Assertions.assertEquals(3, containerFor421.size());
    }

    @Test
    public void testAddFor421() {
        Assertions.assertEquals(3, containerFor421.add("777"));
    }

    @Test
    public void testGetFor421() {
        Assertions.assertEquals("3", containerFor421.get(2));
    }

    String[] dataFor422 = new String[]{};
    DataContainer<String> containerFor422 = new DataContainer<>(dataFor422);

    @Test
    public void testGetFor422() {
        Assertions.assertNull(containerFor422.get(0));
    }

    @Test
    public void testIsEmptyFor422() {
        Assertions.assertTrue(containerFor422.isEmpty());
    }

    @Test
    public void testSizeFor422() {
        Assertions.assertEquals(0, containerFor422.size());
    }

    @Test
    public void testAddFor422() {
        Assertions.assertEquals(0, containerFor422.add("777"));
    }

    @Test
    public void testGetFor51() {
        Assertions.assertEquals("777", containerFor422.get(containerFor422.add("777")));
    }

    @Test
    public void testGetFor52() {
        Assertions.assertNull(containerFor422.get(1));
    }

    String[] dataFor811 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor811 = new DataContainer<>(dataFor811);

    @Test
    public void testDeleteFor811() {
        Assertions.assertFalse(containerFor811.delete(null));
    }

    String[] dataFor812 = {"1", "2", "3", "777", null};
    DataContainer<String> containerFor812 = new DataContainer<>(dataFor812);

    @Test
    public void testDelete812() {
        Assertions.assertFalse(containerFor812.delete(null));
    }

    String[] dataFor821 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor821 = new DataContainer<>(dataFor821);

    @Test
    public void testDeleteFor821() {
        Assertions.assertTrue(containerFor821.delete("777"));
    }

    String[] dataFor831 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor831 = new DataContainer<>(dataFor831);

    @Test
    public void testDeleteFor831() {
        Assertions.assertFalse(containerFor831.delete("111"));
    }

    String[] dataFor841 = {"1", "2", "3", "777", "3"};
    DataContainer<String> containerFor841 = new DataContainer<>(dataFor841);
    boolean resultFor841 = containerFor841.delete("3");

    @Test
    public void testGetFor841() {
        Assertions.assertEquals("[1, 2, 777, 3]",
                Arrays.toString(containerFor841.getItems()));
    }

    @Test
    public void testDeleteFor841() {
        Assertions.assertTrue(resultFor841);
    }

    String[] dataFor721 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor721 = new DataContainer<>(dataFor721);
    boolean resultFor721 = containerFor721.delete(9);

    @Test
    public void testGetFor721() {
        Assertions.assertEquals("[1, 2, 3, 777]",
                Arrays.toString(containerFor721.getItems()));
    }

    @Test
    public void testDeleteFor721() {
        Assertions.assertFalse(resultFor721);
    }

    String[] dataFor711 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor711 = new DataContainer<>(dataFor711);
    boolean resultFor711 = containerFor711.delete(3);

    @Test
    public void testGetFor711() {
        Assertions.assertEquals("[1, 2, 3]",
                Arrays.toString(containerFor711.getItems()));
    }

    @Test
    public void testDeleteFor711() {
        Assertions.assertTrue(resultFor711);
    }

    String[] dataFor731 = {"1", "2", "3", "777"};
    DataContainer<String> containerFor731 = new DataContainer<>(dataFor731);
    boolean resultFor731 = containerFor731.delete(2);

    @Test
    public void testGetFor731() {
        Assertions.assertEquals("[1, 2, 777]",
                Arrays.toString(containerFor731.getItems()));
    }

    @Test
    public void testDeleteFor731() {
        Assertions.assertTrue(resultFor731);
    }

    Integer[] dataFor101 = {1, 2, 3, 777, 3};
    DataContainer<Integer> containerFor101 = new DataContainer<>(dataFor101);

    @Test
    public void testStringFor101() {
        Assertions.assertEquals("[1, 2, 3, 777, 3]",
                containerFor101.toString());
    }

    Integer[] dataFor102 = {1, 2, 3, null};
    DataContainer<Integer> containerFor102 = new DataContainer<>(dataFor102);

    @Test
    public void testStringFor102() {
        Assertions.assertEquals("[1, 2, 3]",
                containerFor102.toString());
    }

    Integer[] dataFor103 = {};
    DataContainer<Integer> containerFor103 = new DataContainer<>(dataFor103);

    @Test
    public void testStringFor103() {
        Assertions.assertEquals("[]",
                containerFor103.toString());
    }
}
