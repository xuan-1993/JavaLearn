package 面对对象.单元测试;

import org.junit.*;

import static org.junit.Assert.*;

public class Demo1Test {
    public Demo1 demo1;

   @Before
    public void setUP(){
        this.demo1=new Demo1();
    }

    @After
    public void tearDown(){
        this.demo1=null;
    }

    @Test
    public void testAdd(){
        assertEquals(101,this.demo1.add(101));
        assertEquals(1101,this.demo1.add(1000));
    }

    @Test
    public void testSub(){
        assertEquals(-101,this.demo1.sub(100));
    }
}