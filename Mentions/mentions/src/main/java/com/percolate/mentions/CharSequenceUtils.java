package com.percolate.mentions;

/**
 * Char Sequence utility methods.
 *
 * Methods were taken from Apache Commons Lang (http://commons.apache.org/proper/commons-lang/)
 * Copied over to avoid requiring additional dependencies.
 */
class CharSequenceUtils {

    /**
     * Used by the indexOf(CharSequence methods) as a green implementation of indexOf.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
        return cs.toString().indexOf(searchChar.toString(), start);
    }

    /**
     * Used by the lastIndexOf(CharSequence methods) as a green implementation of lastIndexOf
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int lastIndexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
        return cs.toString().lastIndexOf(searchChar.toString(), start);
    }
}
