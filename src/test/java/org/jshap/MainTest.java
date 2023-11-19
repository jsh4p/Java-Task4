package org.jshap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.jshap.Main.input;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // Тест проброса исключения при неправильном пути к файлу
    @Test
    void inputRuntimeExceptionTest() {
        assertThrows(RuntimeException.class, () -> {
            input(new ArrayList<>(), "abcdefg.csv", ';');
        });
    }

    // Тест чтения из файла
    @Test
    void inputTest() {
        ArrayList<Human> humans = new ArrayList<>();
        input(humans, "test.csv", ';');

        assertEquals("[ID: 2307 name: Yaroslav gender: Male " +
                "birthday: 23.07.2003 " + "division: [ID: " + "A".hashCode() + " name: A] salary: 1878]"
                , humans.getFirst().toString());
    }
}