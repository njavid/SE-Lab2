package test.com.company;

import com.company.Rect;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectTest {

    Rect rect1;
    Rect rect2;
    @BeforeEach
    void setUp() {
        rect1 = new Rect(2,3);
        rect2 = new Rect(10,2);
    }
    @Test
    void testGetArea(){
        assertEquals(6,rect1.getArea());
        assertEquals(20,rect2.getArea());

    }
}