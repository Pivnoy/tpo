package part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Cos tests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class CosDecompositionTest {

    private CosDecomposition cosDecomposition;

    @BeforeEach
    void setCosDecomposition() throws IOException {
        cosDecomposition = new CosDecomposition();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "cosInputTestCases.csv")
    void simpleTests (String inputText, String expectedText) {
        double inputValue = Arrays.stream(inputText.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double expectedValue = Arrays.stream(expectedText.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double ACCURACY = 1e-3D;
        double functionResult = cosDecomposition.customCos(inputValue / 180 * Math.PI);
        assertEquals(expectedValue, functionResult, ACCURACY);
    }
}
