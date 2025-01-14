import java.awt.*;
import java.awt.event.KeyEvent;

public class Util {

    public static void typetext(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            try {

                Robot robot = new Robot();
                robot.delay(10);
                if (charArray[i] == 'ą') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ć') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ę') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ł') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ń') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ó') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ś') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ź') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else if (charArray[i] == 'ż') {
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                } else {
                    robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(charArray[i]));
                    robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(charArray[i]));
                }
            } catch (AWTException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public static void runProgram(Robot robot,String program){

        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(50);
        typetext(program);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
    public static void saveProgram(Robot robot,String name){
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);

        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        typetext(name);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);

    }
}
