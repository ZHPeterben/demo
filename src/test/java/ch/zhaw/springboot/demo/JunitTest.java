package ch.zhaw.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.Test;

public class JunitTest {

    @Test
    public void testisEven() {
        boolean result = JunitFunktion.isEven(8);
        assertTrue(result);
    }

    @Test
    public void testisUneven() {
        boolean result = JunitFunktion.isEven(6);
        assertTrue(result);
    }

    @Test
    public void add_emptyString_ReturnsZero () {
        assertEquals(0, StringCalculator.add(" "));
    }

    @Test
    public void Selbsterstellt() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("1",Rechner.convert(1));
    }
    
    @Test
    public void Selbsterstellt5() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("5",Rechner.convert(5));
    }

    @Test
    public void Selbsterstellt3() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("Drü",Rechner.convert(3));
    }

    @Test
    public void Selbsterstellt8() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("Acht",Rechner.convert(8));   
    } 

    @Test
    public void Selbsterstelltvier() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("Vier",Rechner.convert(4));
    }

    @Test
    public void Selbsterstelltüber100dur5() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("Uber 100 & /5",Rechner.convert(100));
        assertEquals("Uber 100 & /5",Rechner.convert(105));
        assertEquals("Uber 100 & /5",Rechner.convert(110));
    }

    @Test
    public void SelbsterstelltNegativ() {
        Rechneneinfach Rechner = new Rechneneinfach();
        assertEquals("Negativ",Rechner.convert(-11));
        assertEquals("Negativ",Rechner.convert(-99));
    }


}
