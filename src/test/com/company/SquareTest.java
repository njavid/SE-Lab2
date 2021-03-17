package test.com.company;

import com.company.Rect;
import com.company.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea(){
        Square square = new Square(4);
        assertEquals(16,square.getArea());
    }
}