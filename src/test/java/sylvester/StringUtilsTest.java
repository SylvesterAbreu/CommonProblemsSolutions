package sylvester;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stringUtils.StringUtils;

public class StringUtilsTest {

    @Test
    public void thatStringPotatoesIsReversed() throws Exception {
        final String original = "potatoes";
        
        final StringUtils stringUtils = new StringUtils();
        final String stringReversed = stringUtils.reverse(original);
        
        assertThat("seotatop", is(equalTo(stringReversed)));
    }
    
    @Test
    public void thatAllWhiteSpacesAreRemovedFromString() throws Exception {
        final String original = "All White Spaces Are Removed From String";
        
        final StringUtils stringUtils = new StringUtils();
        final String noWhiteSpaces = stringUtils.removeWhiteSpaces(original);
        
        assertThat("AllWhiteSpacesAreRemovedFromString", is(equalTo(noWhiteSpaces)));
    }
    
    @Test
    public void thatStringContainsDuplicatedCharacters() throws Exception {
        final String original = "cabage";
        final StringUtils stringUtils = new StringUtils();
        
        assertTrue(stringUtils.hasDuplicates(original));
    }
    
    @Test
    public void thatStringDoenstContainDuplicatedCharacters() throws Exception {
        final String train = "train";
        final StringUtils stringUtils = new StringUtils();
        
        assertFalse(stringUtils.hasDuplicates(train));
    }
}
