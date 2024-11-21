package PR1.PR1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComparisonTest {

    @Test
    public void testCompareNormalValid() {
        assertEquals("A", Comparison.compareNormal(5, 3));  // A is greater than B
        assertEquals("B", Comparison.compareNormal(2, 7));  // B is greater than A
        assertEquals("Equal", Comparison.compareNormal(4, 4));  // A equals B
    }

    @Test
    public void testCompareNormalInvalid() {
        assertEquals("Error: Both inputs must be numbers", Comparison.compareNormal("five", 3));  // Invalid input
        assertEquals("Error: Both inputs must be numbers", Comparison.compareNormal(5, "seven"));  // Invalid input
    }

    @Test
    public void testCompareNegativesValid() {
        assertEquals("A", Comparison.compareNegatives(5, 3));  // -5 is less than -3, so A is larger
        assertEquals("B", Comparison.compareNegatives(2, 7));  // -2 is greater than -7, so B is larger
        assertEquals("Equal", Comparison.compareNegatives(-4, -4));  // -4 equals -4
    }

    @Test
    public void testCompareNegativesInvalid() {
        assertEquals("Error: Both inputs must be numbers", Comparison.compareNegatives("five", 3));  // Invalid input
        assertEquals("Error: Both inputs must be numbers", Comparison.compareNegatives(5, "seven"));  // Invalid input
    }

    @Test
    public void testCompareElementsValid() {
        assertEquals("A", Comparison.compareElements(1, 0.5));  // 1/1 > 1/0.5, so A is larger
        assertEquals("B", Comparison.compareElements(0.25, 0.5));  // 1/0.25 < 1/0.5, so B is larger
        assertEquals("Equal", Comparison.compareElements(2, 2));  // 1/2 == 1/2, so they are equal
    }

    @Test
    public void testCompareElementsInvalid() {
        assertEquals("Error: Both inputs must be numbers", Comparison.compareElements("one", 3));  // Invalid input
        assertEquals("Error: Both inputs must be numbers", Comparison.compareElements(3, "three"));  // Invalid input
    }

    @Test
    public void testCompareElementsZero() {
        
        assertEquals("Error: Both inputs must be numbers", Comparison.compareElements(0, 3));  // Invalid input (zero cannot be used in reciprocal comparison)
        assertEquals("Error: Both inputs must be numbers", Comparison.compareElements(3, 0));  // Invalid input (zero cannot be used in reciprocal comparison)
    }
}