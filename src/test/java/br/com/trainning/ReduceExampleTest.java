package br.com.trainning;

import br.com.trainning.utils.ReduceExample;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReduceExampleTest {

    @Test
    public void sumFromListIntShouldReturnSum15() {
        final List<Integer> items = Arrays.asList(1,2,3,4,5);
        int result = ReduceExample.sumFromListInt(items);
        assertEquals(15, result);
    }

    @Test
    public void sumFromListLongShouldReturnSum15() {
        final List<Long> items = Arrays.asList(10L,20L,30L,40L,50L);
        long result = ReduceExample.sumFromListLong(items);
        assertEquals(150L, result);
    }

    @Test
    public void concatFromListStringShouldReturnStringWithAllValues() {
        final List<String> items = Arrays.asList("1A", "99", "C30", "99A", "2A", "40W");
        String result = ReduceExample.concatFromListString(items);
        assertEquals("1A99C3099A2A40W", result);
    }
}
