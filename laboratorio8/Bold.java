package laboratorio8;

import java.util.Objects;

public class Bold implements Formatting {

    private String text;

    public Bold(String text) {
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
        String formattedText = "\033[0;1m" + this.text;
        return formattedText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bold bold = (Bold) o;
        return Objects.equals(text, bold.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
