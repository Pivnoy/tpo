package part2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "BubbleSort tests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    public void setBubbleSort() {
        bubbleSort = new BubbleSort();
    }

    @ParameterizedTest(name = "Basic sort test")
    @CsvFileSource(resources = "bubbleSortTestCases.csv")
    void bubbleSortBasicTest(String inputText, String expectedText) {
        int [] array = Arrays.stream(inputText.replaceAll(" ", "").split(";"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] trueArray = Arrays.stream(expectedText.replace(" ","").split(";"))
                .mapToInt(Integer::parseInt)
                .toArray();
        bubbleSort.bubbleSort(array);
        assertArrayEquals(array, trueArray);
    }

    @ParameterizedTest(name = "Null source test")
    @NullSource
    void bubbleSortNullTest(int [] arr) {
        bubbleSort.bubbleSort(arr);
        assertNull(arr);
    }

    @ParameterizedTest(name = "Empty source test")
    @EmptySource
    void bubbleSortEmptyTest(int [] arr) {
        int [] empty = new int[0];
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(empty, arr);
    }
}
