import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 09/08/2017.
 */
public class TestUniqueSum {

    @Test public void testSumUnique() {
        UniqueSum test = new UniqueSum();
        assertEquals(3, test.sumUnique(3,4,4));
    }
}
