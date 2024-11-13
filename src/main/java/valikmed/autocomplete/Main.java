package valikmed.autocomplete;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create input reader
        var input = new Scanner(System.in);

        var ac = new AutoComplete();
        ac.elements = List.of("Pandora", "Pinterest", "Paypal", "Pg&e",
                "Project free tv", "Priceline", "Press democrat", "Progressive",
                "Project runway", "Proactive", "Programming", "Progeria", "Progesterone",
                "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank", "Bowlw",
                "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe"
        );

        while (true){
            System.out.printf("::> ");
            var stringInput = input.nextLine();

            var variants  = ac.complatByContaning(stringInput);

            for (var variant : variants){
                System.out.printf("[ >> ]" + variants);
            }
        }
    }


}