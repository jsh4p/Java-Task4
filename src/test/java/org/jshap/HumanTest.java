package org.jshap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    // Тест проброса исключения при неправильной длине массива
    @Test
    void constructorWithParametersIllegalArgumentExceptionTest() {
        String[] vars = {"2307", "Yaroslav", "Male", "23.07.2003", "A"};

        assertThrows(IllegalArgumentException.class, () -> {
            new Human(vars);
        });
    }

    // Тест проброса исключения при нулевой ссылке в конструкторе
    @Test
    void constructorWithParametersNullPointerExceptionTest() {
        String[] vars = {null, "Yaroslav", null, "23.07.2003", "A", "1878"};

        assertThrows(NullPointerException.class, () -> {
            new Human(vars);
        });
    }
}