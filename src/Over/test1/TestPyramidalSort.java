package Over.test1;

import org.junit.Assert;
import org.junit.Test;
import java.util.Collections;
import Over.sort.PyramidalSort;
import Over.sort.Sort;

import java.util.ArrayList;
import java.util.Random;

public class TestPyramidalSort {
    @Test
    public void testPyramidalSort() {
        Sort sort = new PyramidalSort();
        ArrayList<Integer> actualList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 15; i++)
            actualList.add(rnd.nextInt(100));

        ArrayList<Integer> expectedList = new ArrayList<>(actualList);
        Collections.sort(expectedList);


        Assert.assertEquals(expectedList, sort.doSort(actualList));
    }
}
