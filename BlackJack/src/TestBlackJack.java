import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 09/08/2017.
 */
public class TestBlackJack {

    @Test
    public void testBlackJack() {
        BlackJack test = new BlackJack();
        assertEquals(21, test.blackJack(0,21));
    }
}
