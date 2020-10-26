package laboratorio8;


import java.util.Objects;

public class UpperCase implements Formatting {

    private String text;

    public UpperCase(String text) {
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
        String formattedText = this.text.toUpperCase();
        return formattedText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpperCase upperCase = (UpperCase) o;
        return Objects.equals(text, upperCase.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
