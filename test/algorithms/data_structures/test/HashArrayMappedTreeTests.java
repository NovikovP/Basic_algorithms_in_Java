package algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algorithms.data_structures.HashArrayMappedTrie;
import algorithms.data_structures.test.common.JavaMapTest;
import algorithms.data_structures.test.common.MapTest;
import algorithms.data_structures.test.common.Utils;
import algorithms.data_structures.test.common.Utils.TestData;

public class HashArrayMappedTreeTests {

    @Test
    public void testHAMT() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "HAMT";
        HashArrayMappedTrie<Integer,String> map = new HashArrayMappedTrie<Integer,String>();
        java.util.Map<Integer,String> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Integer.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
