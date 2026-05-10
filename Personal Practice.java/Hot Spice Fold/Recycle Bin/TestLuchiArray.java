import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArray {

    private LuchiArray numbers;

    @BeforeEach
    void setUp(){
        numbers = new LuchiArray();
    }

    @Test
    void testThatArrayListIsEmpty(){
        assertTrue(numbers.isEmpty());
    }

    @Test
   void testThatListIsNotEmpty(){
        numbers.add(20);
        assertFalse(numbers.isEmpty());
    }
    @Test
   void testThatListAndCanGet(){
        numbers.get(10);
        assertEquals(10, numbers.get(0));
    }

    @Test
    void testToCheckTheIfListContainsAnElement(){
        numbers.add(10);
        assertTrue(numbers.contains(10));
    }

    @Test
    void testToCheckTheSizeOfTheList(){
        numbers.add(10);
        numbers.add(10);
        assertEquals(2, numbers.size());
    }
}

