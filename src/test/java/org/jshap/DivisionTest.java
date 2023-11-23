package org.jshap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    // Тест проброса ошибки при нулевом указателе
    @Test
    void testConstructorWithParametersNullPointerException() {
        assertThrows(NullPointerException.class, () ->{
            new Division(null);
        });
    }

    // Тест программной генерации ID-шников
    @Test
    void testIDGenerator() {
        Division div = new Division("A");
        Division div2 = new Division("B");
        Division div3 = new Division("A");

        assertEquals(1, div.getID());
        assertEquals(2, div2.getID());
        assertEquals(div3.getID(), div.getID());
    }
}