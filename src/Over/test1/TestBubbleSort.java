package Over.test1;

import org.junit.Assert;
import org.junit.Test;
import Over.sort.BubbleSort;
import Over.sort.BucketSort;
import Over.sort.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TestBubbleSort {
    @Test
    public void testBubbleSort() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100));
        }

        ArrayList<Integer> sorted = (ArrayList<Integer>) arrayList.clone();
        sorted.sort(Comparator.naturalOrder());

        Sort sort = new BubbleSort();
        Assert.assertEquals(sorted, sort.doSort(arrayList));
    }
}
