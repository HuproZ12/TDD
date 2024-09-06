package org.example.Exercice_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore diceScore;
    private Ide de;

    @BeforeEach
    public void init(){
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
    }

    //- lorsque les 2 dés sont identiques on recupere bien valeur du dé * 2 + 10
    @Test
    public void testWhenDicesAreEqualsThenResultDiceValue_X_2_Plus_10(){
        // Arrange
        int expected = 16;
        Mockito.when(de.getRoll()).thenReturn(3);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    //- dans le cas ou les 2 dés sont identiques et egaux a 6 on recupere 30
    @Test
    public void testWhenDicesAreEqualsAndEqualsTo_6_ThenResult_30(){
        // Arrange
        int expected = 30;
        Mockito.when(de.getRoll()).thenReturn(6);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    //- dans le cas ou les dé sont quelconque on recupere la valeure du plus haut des 2
    @Test
    public void testWhenDicesAreUnequalsThenResultHighestValue(){
        // Arrange
        int expected = 2;
        Mockito.when(de.getRoll()).thenReturn(2).thenReturn(1);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }
}