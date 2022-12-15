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

    @Test
    public void dosRestarDosEsCero() {
        int expected = 0;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.restar(numero1, numero2));
    }

    @Test
    public void tresRestarSieteEsMenosCuatro() {
        int expected = -4;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertTrue("3 menos 7 deberia de ser -4", expected == calc.restar(numero1, numero2));

    }

    @Test
    public void tresRestarSieteNoEsCien() {
        int expected = 100;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertFalse("3 mas 7 no deberia de ser 100", expected == calc.restar(numero1, numero2));

    }

    @Test
    public void dosMultDosEsCuatro() {
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.multiplicar(numero1, numero2));
    }

    @Test
    public void tresMultiplicarSieteEsVeintiUno() {
        int expected = 21;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertTrue("3 x 7 deberia de ser 21", expected == calc.multiplicar(numero1, numero2));

    }

    @Test
    public void tresMultiplicarSieteNoEsCien() {
        int expected = 100;
        int numero1 = 3, numero2 = 7;
        Calculadora calc = new Calculadora();
        assertFalse("3 mas 7 no deberia de ser 100", expected == calc.multiplicar(numero1, numero2));

    }

}
