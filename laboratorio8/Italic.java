package laboratorio8;

import java.util.Objects;

public class Italic implements Formatting {

    private String text;

    public Italic(String text) {
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
        String formattedText = "\033[3m" + this.text + "\033[0m";
        return formattedText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Italic italic = (Italic) o;
        return Objects.equals(text, italic.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
