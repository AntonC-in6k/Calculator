package tddrequirementspractice;

import org.junit.Assert;
import org.junit.Test;
import com.InterLink.Calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
    public void inputTwoNumbersTest() throws Exception{
        assertThat(Calculator.add("1,2"), is(3));
    }

    @Test (expected = RuntimeException.class)
    public void inputMoreThanTwoNumbersTest() throws Exception{
        Calculator.add("1,2,3");
    }
    @Test (expected = RuntimeException.class)
    public void inputNotNumberTest() throws Exception{
        Calculator.add("1,x");
    }

}
