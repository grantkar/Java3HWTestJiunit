import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrBooleanTest {

    MainApp mainApp;
    public int [] arr;

    @Before
    public void addObject(){
        mainApp = new MainApp(arr);
    }


    @Test
    public void test1(){
        int [] arr = { 1, 1, 1, 4, 4, 1, 4, 4};
        boolean val = true;

        Assert.assertEquals(val,mainApp.oneAndFourToArray(arr));


    }

    @Test
    public void test2(){
        int [] arr = { 1, 1, 1, 1, 1, 1};
        boolean val = false;

        Assert.assertEquals(val,mainApp.oneAndFourToArray(arr));

    }

    @Test
    public void test3(){
        int [] arr = { 4, 4, 4, 4};
        boolean val = false;

        Assert.assertEquals(val,mainApp.oneAndFourToArray(arr));
    }

    @Test
    public void test4(){
        int [] arr = { 1, 4, 4, 1, 1, 4, 3};
        boolean val = false;

        Assert.assertEquals(val,mainApp.oneAndFourToArray(arr));
    }
}
