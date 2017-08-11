import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 09/08/2017.
 */
public class TestTooHot {

    @Test public void testTooHot() {
        TooHot test = new TooHot();
        assertTrue("true", test.tooHot(100, true));
    }
}
