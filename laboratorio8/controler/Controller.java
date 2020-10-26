package laboratorio8.controler;

import laboratorio8.*;

public class Controller {

    public Controller() {
    }

    public String toFormatText(String text, int opt) {
        Formatting formattingType = null;

        switch (opt) {
            case 1:
                formattingType = new UpperCase(text);
                break;
            case 2:
                formattingType = new LowerCase(text);
                break;
            case 3:
                formattingType = new Bold(text);
                break;
            case 4:
                formattingType = new Italic(text);
                break;
            default:
                System.out.println("Invalid option!");
        }

        return formattingType.toFormat();
    }

}
