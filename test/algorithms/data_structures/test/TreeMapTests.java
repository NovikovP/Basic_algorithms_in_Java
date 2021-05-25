package algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algorithms.data_structures.TreeMap;
import algorithms.data_structures.test.common.JavaMapTest;
import algorithms.data_structures.test.common.MapTest;
import algorithms.data_structures.test.common.Utils;
import algorithms.data_structures.test.common.Utils.TestData;

public class TreeMapTests {

    @Test
    public void testTreeMap() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "TreeMap";
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        java.util.Map<String,Integer> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, String.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
