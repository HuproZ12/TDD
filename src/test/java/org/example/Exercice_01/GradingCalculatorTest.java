package org.example.Exercice_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GradingCalculatorTest {
    private GradingCalculator gradingCalculator;

    @ParameterizedTest
    @CsvSource({"95, 90, A",
                "85, 90, B",
                "65, 90, C",
                "95, 65, B",
                "95, 55, F",
                "65, 55, F",
                "50, 90, F"})
    public void whenScoreAndAttendanceThenResultAwaitedScore(int score, int attendancePercentage, char awaitedScore){
        // Arrange
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        //Act
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals(awaitedScore,result);
    }
}