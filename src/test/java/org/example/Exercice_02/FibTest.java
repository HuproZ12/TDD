package org.example.Exercice_02;

import com.google.common.collect.Ordering;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FibTest {

    //- Lors du déclanchement de la fonction GetFibSeries() avec un Range de 1
    //        - Le résultat n’est pas vide
    //        - Le résultat correspond à une liste qui contient {0}
    @Test
    public void testGetFibSeriesWithRange1(){
        // Arrange
         Fib fib = new Fib(1);

        //Act
        List<Integer> fibSeries = fib.getFibSeries();

        //Assert
        assertFalse(fibSeries.isEmpty());
        assertTrue(fibSeries.contains(0));
    }

    //- Lors du déclanchement de la fonction GetFibSeries() avec un Range de 6
    //        - Le résultat contient le chiffre 3
    //        - Le résultat contient 6 éléments
    //        - Le résultat n’a pas le chiffre 4 en son sein
    //        - Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
    //        - Le résultat est trié de façon ascendance
    @Test
    public void testGetFibSeriesWithRange6(){
        // Arrange
        Fib fib = new Fib(6);

        //Act
        List<Integer> fibSeries = fib.getFibSeries();

        //Assert
        assertTrue(fibSeries.contains(3));
        assertEquals(6, fibSeries.size());
        assertFalse(fibSeries.contains(4));
        assertEquals(Arrays.asList(0,1,1,2,3,5), fibSeries);
        assertTrue(Ordering.natural().isOrdered(fibSeries));
    }
}