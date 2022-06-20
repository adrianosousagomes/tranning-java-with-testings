package br.com.trainning;

import br.com.trainning.utils.ListExample;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListExampleTest {
    @Test
    public void sortListStringShouldReturnSortedListAsc() {
        final List<String> items = Arrays.asList("Maria", "João", "Batista", "Zoe", "Martins", "Lívia", "Adriano", "Lidiane", "Catarina", "Daniela");
        List<String> sortedList = ListExample.sort(items);
        Assert.assertEquals(10, sortedList.size());
        Assert.assertEquals("Adriano", sortedList.get(0));
        Assert.assertEquals("Batista", sortedList.get(1));
        Assert.assertEquals("Catarina", sortedList.get(2));
        Assert.assertEquals("Daniela", sortedList.get(3));
    }

    @Test
    public void sortListStringShouldReturnReverseList() {
        final List<String> items = Arrays.asList("Maria", "João", "Batista", "Zoe", "Martins", "Lívia", "Adriano", "Lidiane", "Catarina", "Daniela");
        System.out.println(items);
        List<String> sortedList = ListExample.reverse(items);
        System.out.println(sortedList);
        Assert.assertEquals(10, sortedList.size());
        Assert.assertEquals("Zoe", sortedList.get(0));
        Assert.assertEquals("Martins", sortedList.get(1));
        Assert.assertEquals("Maria", sortedList.get(2));
        Assert.assertEquals("Lívia", sortedList.get(3));
    }
}
