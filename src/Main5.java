import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz fraze do wyszukiwania");
        String fraza = scanner.nextLine();
        String website = "chrome";
        Util.runProgram(robot,website);
        robot.delay(500);
        Util.typetext(fraza);
        robot.delay(5);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        getScreen(robot,"screen");

    }
    public static void getScreen(Robot robot,String name){
        Rectangle rectangle = new Rectangle(1920,1080);
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try{
            ImageIO.write(screen,"jpg",new File(name));
        }
        catch (Exception e){}


    }
}
