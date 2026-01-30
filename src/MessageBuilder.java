public class MessageBuilder
{
    private String message;
    private int numWords;

    public MessageBuilder(String startingWord)
    {
        String currentWord = startingWord;
        numwWords = 0;
        message = startingWord + " ";
        while (!(nextWord.equals(null))
        {
            message += getNextWord(currentWord) + " ";
            currentWord = getNextWord(currentWord);
        }

    }
    /**
     * Returns a word to follow the word specified by the
     * parameter or null if there are no remaining words.
     * Precondition: s is a single word with no spaces.
     * Postcondition: Returns an individual word with no spaces.
     */
    public String getNextWord(String s)
    { /* implementation not shown */ }
    /**
     * Returns an abbreviation for the instance variable message,
     * as described in part (b)
     * Preconditions: Each word in message is separated by a
     *
     *
     * Postcondition: message is unchanged.
     */
    public String getAbbreviation()
    { /* to be implemented in part (b) */ }
/* There may be instance variables, constructors, and methods
that are not shown. */
}
