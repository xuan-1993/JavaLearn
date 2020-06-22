package 面对对象.单元测试;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Demo2Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Disabled
    @Test
    public void test(){
        assertEquals(-1,Demo2.fact(-1));
    }
}