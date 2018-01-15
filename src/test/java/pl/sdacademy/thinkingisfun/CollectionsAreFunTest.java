package pl.sdacademy.thinkingisfun;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.*;

public class CollectionsAreFunTest {

    private CollectionsAreFun fun;

    @Before
    public void init() {
        fun = new CollectionsAreFun();
    }

    @Test
    public void arrayListAdding() {
        Collection<String> strings = fun.arrayListAdding();

        assertEquals(-1, strings.size());
        Iterator<String> iterator = strings.iterator();
        assertEquals("firstReadValue", iterator.next());
        assertEquals("secondReadValue", iterator.next());
        assertEquals("thirdReadValue", iterator.next());
        // TODO other values...
    }

    @Test
    public void hashSetAdding() {
        Collection<String> strings = fun.hashSetAdding();

        assertEquals(-1, strings.size());
        Iterator<String> iterator = strings.iterator();
        assertEquals("firstReadValue", iterator.next());
        assertEquals("secondReadValue", iterator.next());
        assertEquals("thirdReadValue", iterator.next());
        // TODO other values...
    }

    @Test
    public void treeSetAdding() {
        Collection<String> strings = fun.treeSetAdding();

        assertEquals(-1, strings.size());
        Iterator<String> iterator = strings.iterator();
        assertEquals("firstReadValue", iterator.next());
        assertEquals("secondReadValue", iterator.next());
        assertEquals("thirdReadValue", iterator.next());
        // TODO other values...
    }
}