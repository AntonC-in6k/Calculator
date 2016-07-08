package tddrequirementspractice;

import org.junit.Assert;
import org.junit.Test;
import com.InterLink.Calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
/**
 * Created by employee on 7/8/16.
 */
public class TDDPracticeTests {


    @Test
    public void createSimpleCalculatorTest() throws Exception {
        assertThat(Calculator.add());

    }
}
