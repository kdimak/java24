package ua.nure.kp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringHelperTest {

    @Test
    public void findsFirstOccurrenceAtTheBeginning() {
        StringHelper stringHelper = new StringHelper();

        String haystack = "sadbutsad";
        String needle = "sad";

        int index = stringHelper.findsFirstOccurrence(haystack, needle);

        Assertions.assertEquals(0, index);
    }

    @Test
    public void findsFirstOccurrenceAtTheMiddle() {
        StringHelper stringHelper = new StringHelper();

        String haystack = "busadtsad";
        String needle = "sad";

        int index = stringHelper.findsFirstOccurrence(haystack, needle);

        Assertions.assertEquals(2, index);
    }

    @Test
    public void returnsMinusOneIfSubstringIsNotFound() {
        StringHelper stringHelper = new StringHelper();

        String haystack = "leetcode";
        String needle = "leeto";

        int index = stringHelper.findsFirstOccurrence(haystack, needle);

        Assertions.assertEquals(-1, index);
    }

}
