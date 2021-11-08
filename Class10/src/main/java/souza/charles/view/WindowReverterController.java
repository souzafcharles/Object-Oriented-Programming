package souza.charles.view;

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