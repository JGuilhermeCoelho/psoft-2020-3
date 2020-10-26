package laboratorio8;

import java.util.Objects;

public class LowerCase implements Formatting {

    private String text;

    public LowerCase(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toFormat() {
        String formattedText = this.text.toLowerCase();
        return formattedText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LowerCase lowerCase = (LowerCase) o;
        return Objects.equals(text, lowerCase.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
