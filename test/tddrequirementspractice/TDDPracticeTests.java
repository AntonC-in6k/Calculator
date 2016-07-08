package tddrequirementspractice;

import org.junit.Test;
import com.InterLink.Calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


/**
 * Created by employee on 7/8/16.
 */
public class TDDPracticeTests {


    @Test
    public void inputEmptyStringTest() throws Exception {
        assertThat(Calculator.add(""), is(0));
    }

    @Test
    public void inputOneNumberTest() throws Exception {
        assertThat(Calculator.add("1"), is(1));
    }

    @Test
    public void inputTwoNumbersTest() throws Exception {
        assertThat(Calculator.add("1,2"), is(3));
    }

    @Test(expected = RuntimeException.class)
    public void inputNotNumberTest() throws Exception {
        Calculator.add("1,x");
    }

    @Test
    public void inputManyNumbersTest() throws Exception {
        assertThat(Calculator.add("1,2,3,4,5"), is(15));
    }

    @Test
    public void inputNumbersSeparatedByNewLineTest() throws Exception {
        assertThat(Calculator.add("1\n2,3,4,5"), is(15));
    }

    @Test
    public void inputCustomDelimitersTest() throws Exception {
        assertThat(Calculator.add("//;\n1,2,3;4,5"), is(15));
    }

    public void checkForRightExceptionMessage(String addParam, String expectedMessage) {
        try {
            Calculator.add(addParam);
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), is(expectedMessage));
        }

    }

    @Test
    public void inputOneDigitDegreeZero() throws Exception {
        String expectedMessage = "Negatives not allowed: -3";
        checkForRightExceptionMessage("1,2,-3,4,5", expectedMessage);
    }

    @Test
    public void inputMoreThanOneDigitsDegreeZero() throws Exception {
        String expectedMessage = "Negatives not allowed: -3 -5";
        checkForRightExceptionMessage("1,2,-3,4,-5", expectedMessage);
    }

    @Test
    public void digitMoreThanOneThousandMustBeIgnoredTest() throws Exception {
        assertThat(Calculator.add("1,2000,3,4,5"), is(13));
    }
}
