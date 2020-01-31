package Chapter9;


import static org.junit.Assert.*;
import org.junit.Test;

public class Test2 {
        public void test(){
            Wheel wheel = new Wheel(26, 2);
            assertEquals(30,wheel.diameter());

        }
    }
}
