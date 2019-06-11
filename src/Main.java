import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    public void assertTrue(){
        Assertions.assertTrue(true);
    }

    @Test
    public void anotherSuperTest(){
        Assertions.assertFalse(false);
    }

}
