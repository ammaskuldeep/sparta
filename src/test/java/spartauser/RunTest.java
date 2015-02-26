package spartauser;

/**
 * Created by ammaskuldeep on 23/02/15.
 */

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@Cucumber.Options(
        format = {"html:target/cucumber"},
        tags = {"@spuserlogin"})



public class RunTest {
}


