package daw.programacion.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void dosSumarDosEsCuatro() {
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.sumar(numero1, numero2));
    }

    @Test
    public void cincoSumarSieteEsDoce() {
        int expected = 12;
        int numero1 = 5, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertEquals(expected, calc.sumar(numero1, numero2));

    }

    @Test
    public void tresSumarSieteEsDiez() {
        int expected = 10;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertTrue("3 mas 7 deberia de ser 10", expected == calc.sumar(numero1, numero2));

    }

    @Test
    public void tresSumarSieteNoEsCien() {
        int expected = 100;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertFalse("3 mas 7 no deberia de ser 100", expected == calc.sumar(numero1, numero2));

    }
}
