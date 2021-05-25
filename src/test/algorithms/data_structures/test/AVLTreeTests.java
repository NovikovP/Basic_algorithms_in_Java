package algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import algorithms.data_structures.AVLTree;
import algorithms.data_structures.BinarySearchTree;
import algorithms.data_structures.test.common.JavaCollectionTest;
import algorithms.data_structures.test.common.TreeTest;
import algorithms.data_structures.test.common.Utils;
import algorithms.data_structures.test.common.Utils.TestData;

public class AVLTreeTests {

    @Test
    public void testAVLTree() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "AVL Tree";
        BinarySearchTree<Integer> bst = new AVLTree<Integer>();
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Integer.class, bstName, 
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName, 
                                                 data.unsorted, data.sorted, data.invalid));
    }
}
