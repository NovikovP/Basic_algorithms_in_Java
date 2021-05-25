package Over.test1;

import org.junit.Assert;
import org.junit.Test;
import Over.sort.QuickSort;
import Over.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListExample {
    @Test
    public void testQuickSort() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 3, 5, -1, 576, 8));
        Sort sort = new QuickSort();
        Over.ListExample listExample = new Over.ListExample(arrayList);
        Assert.assertEquals(arrayList, listExample.getData());
    }

    @Test
    public void testListPrint() throws  Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Over.ListExample listExample = new Over.ListExample(arrayList);
        Assert.assertEquals(arrayList.toString(), listExample.getData().toString());
    }
}
