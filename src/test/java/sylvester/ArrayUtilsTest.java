package sylvester;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ArrayUtilsTest {

    @Test
    public void thatTwoArraysAreEqual() throws Exception {
        final int[] arrayOne = new int[1];
        arrayOne[0] = 2;

        final int[] arrayTwo = new int[1];
        arrayTwo[0] = 2;

        assertThat(arrayOne, is(equalTo(arrayTwo)));
    }
}
