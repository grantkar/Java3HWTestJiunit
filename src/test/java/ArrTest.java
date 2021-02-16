import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrTest {
    MainApp mainApp;
    public int [] arr;

    @Before
    public void addObject(){
        mainApp = new MainApp(arr);
    }

    @Test
    public void test1(){
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] ack = {5};
        Assert.assertArrayEquals(ack,mainApp.newArrBeforeFour(arr1));
    }

    @Test
    public void test2(){
        int [] arr2 = {4, 2, 3, 7, 5};
        int [] ack = {2, 3, 7, 5};
        Assert.assertArrayEquals(ack,mainApp.newArrBeforeFour(arr2));
    }

    @Test
    public void test3(){
        int [] arr3 = {1, 4};
        int [] ack = {};
        Assert.assertArrayEquals(ack,mainApp.newArrBeforeFour(arr3));
    }





    @Test(expected = RuntimeException.class)
    public void testExeption(){
        int [] arr = {1, 2, 3, 3, 5};
        mainApp.newArrBeforeFour(arr);

    }
}
