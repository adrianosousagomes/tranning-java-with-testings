package br.com.trainning;

import br.com.trainning.utils.HashMapExample;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class HashMapExampleTest {

    @Test
    public void shouldReturnListOrdered() {
        Map<Integer, String> items = HashMapExample.items();
        System.out.println(items);
        Map<Integer, String> sortedMap = HashMapExample.sort(items);
        System.out.println(sortedMap);

        Assert.assertEquals(7, sortedMap.keySet().toArray()[0]);
        Assert.assertEquals(8, sortedMap.keySet().toArray()[1]);
        Assert.assertEquals(4, sortedMap.keySet().toArray()[2]);
    }
}
