import java.awt.Robot;
import java.awt.event.KeyEvent;

public class OpenDVD {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            // Symulacja naciśnięcia klawisza Windows + E (otwarcie Eksploratora Windows)
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_WINDOWS);

            // Czekanie na otwarcie Eksploratora Windows
            Thread.sleep(2000);

            // Symulacja naciśnięcia klawisza Alt + D (przejście do paska adresu)
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyRelease(KeyEvent.VK_B);
            robot.keyRelease(KeyEvent.VK_ALT);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
