import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stringUtils.SylvesterStringUtils;

public class SylvesterStringUtilsTest {

    @Test
    public void thatStringPotatoesIsReversed() throws Exception {
        final String original = "potatoes";
        
        final SylvesterStringUtils sylvesterStringUtils = new SylvesterStringUtils();
        final String stringReversed = sylvesterStringUtils.reverse(original);
        
        assertThat("seotatop", is(equalTo(stringReversed)));
    }
    
    @Test
    public void thatAllWhiteSpacesAreRemovedFromString() throws Exception {
        final String original = "All White Spaces Are Removed From String";
        
        final SylvesterStringUtils sylvesterStringUtils = new SylvesterStringUtils();
        final String noWhiteSpaces = sylvesterStringUtils.removeWhiteSpaces(original);
        
        assertThat("AllWhiteSpacesAreRemovedFromString", is(equalTo(noWhiteSpaces)));
    }
    
    @Test
    public void thatStringContainsDuplicatedCharacters() throws Exception {
        final String original = "cabage";
        final SylvesterStringUtils sylvesterStringUtils = new SylvesterStringUtils();
        
        assertTrue(sylvesterStringUtils.hasDuplicates(original));
    }
}
