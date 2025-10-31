package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void deleteCity_removesExisting() {
        CustomList list = new CustomList();
        City c1 = new City("Calgary", "AB");
        City c2 = new City("Edmonton", "AB");

        list.addCity(c1);
        list.addCity(c2);
        assertEquals(2, list.countCities());
        assertTrue(list.hasCity(c1));

        list.deleteCity(c1);
        assertFalse(list.hasCity(c1));
        assertEquals(1, list.countCities());
        assertTrue(list.hasCity(c2));
    }

}