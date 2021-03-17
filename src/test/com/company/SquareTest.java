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

        Square square1 = new Square(5);
        assertEquals(25,square1.getArea());
    }

    @Test
    public void getSide() {
        Square square = new Square(7);
        assertEquals(7,square.getSide());

        Square square1 = new Square(2);
        assertEquals(2,square1.getSide());

    }
}