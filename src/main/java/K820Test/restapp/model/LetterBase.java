package K820Test.restapp.model;

public class LetterBase {

    private Character letter;
    private int letterCount;
    private int maxSubstring;

    public LetterBase(Character letter, int letterCount, int maxSubstring){
        this.letter = letter;
        this.letterCount = letterCount;
        this.maxSubstring = maxSubstring;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LetterBase)) return false;

        LetterBase that = (LetterBase) o;

        return letter != null ? letter.equals(that.letter) : that.letter == null;
    }

    @Override
    public String toString() {
        return "LetterBase{" +
                "letter=" + letter +
                '}';
    }

    @Override
    public int hashCode() {
        return letter != null ? letter.hashCode() : 0;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }

    public int getMaxSubstring() {
        return maxSubstring;
    }

    public void setMaxSubstring(int maxSubstring) {
        this.maxSubstring = maxSubstring;
    }



}
