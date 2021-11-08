package souza.charles.view;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: October 25, 2021
*/
public class WindowReverterController {
    private WindowReverter ui;

    public WindowReverterController(WindowReverter ui) {
        this.ui = ui;
    }

    public void reverseInput(){
        final String input = ui.getInput();
        StringBuilder sb = new StringBuilder(input);
        final String reversedString = sb.reverse().toString();
        ui.setResult(reversedString);
    }
}
