package laboratorio8;

import laboratorio8.controler.Controller;

import java.util.Scanner;

public class FormattingApplicaation {

    public static void main(String[] args) {
        int opt = 0;
        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);

        System.out.print("Type text= ");

        String typedText = in.nextLine();

        System.out.println("Choose a formatting type for the typed text= ");
        System.out.println("1-Upper Case");
        System.out.println("2-Lower Case");
        System.out.println("3-Italic");
        System.out.println("4-Bold");

        opt = in.nextInt();

        String text = controller.toFormatText(typedText, opt);
        System.out.println(text);
    }
}
