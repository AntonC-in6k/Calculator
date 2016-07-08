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

}
