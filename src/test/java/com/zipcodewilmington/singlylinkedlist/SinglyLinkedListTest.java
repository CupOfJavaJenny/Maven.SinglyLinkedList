package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

        @Test
        public void linkedListAddTest() {
            SinglyLinkedList list  = new SinglyLinkedList<>();

            list.add(1);
            list.add(2);
            boolean assertListContains = list.isEmpty();
            Assert.assertFalse(assertListContains);
        }

        @Test
        public void linkedListRemoveTest() {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add("pizzaz");
            list.add("hotdog");

            int expectedListSize = 3;
            list.remove("pizzaz");
            int actualListSize = list.size();

            Assert.assertEquals(expectedListSize, actualListSize);
        }


        @Test
        public void linkedListContainsTest(){
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);

            //Object expectedItemInList = 3;
            boolean actualItemInList = list.contains(3);

            Assert.assertTrue(actualItemInList);
        }

        @Test
        public void linkedListFindTest(){
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);

            int expectedIndex = 2;
            int actualIndex = list.find(3);

            Assert.assertEquals(expectedIndex, actualIndex);

        }

        @Test
        public void linkedListGetTest(){
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);

            Object expectedItemReturned = 3;
            Object actualItemReturned = list.get(2);

            Assert.assertEquals(expectedItemReturned, actualItemReturned);
        }

        @Test
        public void linkedListSizeTest(){
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);

            int expectedSize = 3;
            int actualSize = list.size();

            Assert.assertEquals(expectedSize, actualSize);
        }

        @Test
        public void linkedListDeepCopyTest(){
            SinglyLinkedList list1 = new SinglyLinkedList();

            list1.add(1);
            list1.add(2);
            list1.add(3);

            int expectedSizeOfOriginal = 3;
            int actualSizeOfCopy = list1.deepCopy().size();

            Assert.assertEquals(expectedSizeOfOriginal, actualSizeOfCopy);

//           SinglyLinkedList list2 = new SinglyLinkedList();
//
//           list2.add(4);
//
//           Assert.assertFalse(list1.contains(4));
        }

        @Test
        public void testListSortTest(){
            SinglyLinkedList list1 = new SinglyLinkedList();

            list1.add(3);
            list1.add(2);
            list1.add(1);

            int expectedIndex = 1;
            int actualIndex = (int) list1.get(0);

            Assert.assertEquals(expectedIndex, actualIndex);
        }

    
}
