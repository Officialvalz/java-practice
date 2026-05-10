import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest{

    @Test
    void testThatQueueIsEmpty(){
    
    luchiQueue queue = new luchiQueue();

    assertTrue(queue.isEmpty());
    
    }

    @Test
    void testThatQueueListIsNotEmpty(){

    luchiQueue queue = new luchiQueue();

    queue.offer("John");

    assertFalse(queue.isEmpty());

    }

    @Test
    void testThatPeekReturnsTheFirstElement(){

    luchiQueue queue = new luchiQueue();

    queue.offer("James");
    queue.offer("Jerry");
    queue.offer("Jack");

    assertTrue(queue.pull());
    }

    @Test
    void testThatQueueListIsFull(){

    luchiQueue queue = new luchiQueue();

    queue.offer("Mich");
    queue.offer("David");
    queue.offer("Samuel");
    queue.offer("Mary");
    queue.offer("Newton");

    assertTrue(queue.isFull());

    }

    

}
