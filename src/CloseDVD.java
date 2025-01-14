import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class CloseDVD {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            // Krok 1: Otwórz Eksplorator Windows (Windows + E)
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_WINDOWS);

            // Czekaj chwilę, aż Eksplorator Windows się otworzy
            Thread.sleep(2000);  // Można zwiększyć czas, jeśli potrzeba

            // Krok 2: Kliknij w napęd DVD (zakładając, że napęd DVD znajduje się w określonym miejscu ekranu)
            // Pamiętaj, że musisz znaleźć odpowiednie współrzędne na swoim ekranie, gdzie znajduje się napęd
            // Na przykład współrzędne dla napędu DVD mogą wyglądać tak:
            robot.mouseMove(300, 200);  // Zmień te wartości na odpowiednie współrzędne
            robot.mousePress(InputEvent.BUTTON3_MASK);  // Kliknięcie prawym przyciskiem myszy
            robot.mouseRelease(InputEvent.BUTTON3_MASK);

            // Czekaj chwilę, aż pojawi się menu kontekstowe
            Thread.sleep(1000);

            // Krok 3: Kliknij opcję "Wysuń" w menu kontekstowym
            // Znowu musisz znaleźć współrzędne miejsca, w którym pojawi się opcja "Wysuń"
            robot.mouseMove(300, 250);  // Zmień te współrzędne na odpowiednią lokalizację menu "Wysuń"
            robot.mousePress(InputEvent.BUTTON1_MASK);  // Kliknięcie lewym przyciskiem myszy
            robot.mouseRelease(InputEvent.BUTTON1_MASK);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

