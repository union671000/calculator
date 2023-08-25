package com.union671000.calculator; 
import org.junit; 
import static org.junit.Assert.assertEquals; 
 
public class CalculatorTest { 
     private Calculator calculator = new Calculator(); 
 
     @Test 
     public void testSum() { 
          assertEquals(5, calculator.sum(2, 3)); 
     } 
} 