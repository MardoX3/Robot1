import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        System.out.println("Dlugposc boku kwadratu");
        int slide = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj nazwe pliku do zapisu");
        String name = scanner.nextLine();
        robot.delay(1000);

        Util.runProgram(robot,"Mspaint");
        robot.delay(1000);

        int x = 400;
        int y = 300;

        robot.mouseMove(x,y);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(x+slide,y);
        robot.delay(5);
        robot.mouseMove(x+slide,y+slide);
        robot.delay(5);
        robot.mouseMove(x,y+slide);
        robot.delay(5);
        robot.mouseMove(x,y);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Util.saveProgram(robot,name);


    }
}
