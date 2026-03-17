package duke;
import java.util.Scanner;

public class Ui {
    private static final Scanner INPUT = new Scanner(System.in);

    public String readCommand() {
        return INPUT.nextLine().trim();
    }

    public void showWelcome() {
        System.out.println("Welcome to Stocks Tracker!");
        System.out.println("""
                             ______  ________   ______   __    __  __    __   ______  \r
                            /      \\|        \\ /      \\ |  \\  |  \\|  \\  /  \\ /      \\ \r
                           |  $$$$$$\\\\$$$$$$$$|  $$$$$$\\| $$\\ | $$| $$ /  $$|  $$$$$$\\\r
                           | $$___\\$$  | $$   | $$  | $$| $$$\\| $$| $$/  $$ | $$___\\$$\r
                            \\$$    \\   | $$   | $$  | $$| $$$$\\ $$| $$  $$   \\$$    \\ \r
                            _\\$$$$$$\\  | $$   | $$  | $$| $$\\$$ $$| $$$$$\\   _\\$$$$$$\\\r
                           |  \\__| $$  | $$   | $$__/ $$| $$ \\$$$$| $$ \\$$\\ |  \\__| $$\r
                            \\$$    $$  | $$    \\$$    $$| $$  \\$$$| $$  \\$$\\ \\$$    $$\r
                             \\$$$$$$    \\$$     \\$$$$$$  \\$$   \\$$ \\$$   \\$$  \\$$$$$$ \r
                                                                                      \r
                                                                                      \r""");
        System.out.println("Type /help to see available commands.");
    }

    public void showHelp() {
        String s = """
                   Available commands:
                   /create NAME
                   /use NAME
                   /list
                   /list portfolios
                   /list holdings
                   /add --type TYPE --ticker TICKER --qty QTY
                   /remove --type TYPE --ticker TICKER
                   /set --ticker TICKER --price PRICE
                   /setmany --file FILEPATH
                   /value
                   /help
                   /exit
                   """;
        System.out.println(s);
    }
}
