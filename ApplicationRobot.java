import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot robot = new Robot();

        robot.mouseMove(250,1070);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1000);
        robot.keyPress(73);
        robot.delay(1000);
        robot.keyRelease(73);
        robot.delay(1000);
        robot.keyPress(65);
        robot.delay(1000);
        robot.keyRelease(65);
        robot.delay(1000);
        robot.keyPress(78);
        robot.delay(1000);
        robot.keyRelease(78);
        robot.delay(1000);
        robot.keyPress(32);
        robot.delay(1000);
        robot.keyRelease(32);
        robot.delay(1000);
        robot.keyPress(75);
        robot.delay(1000);
        robot.keyRelease(75);
        robot.delay(1000);
        robot.keyPress(65);
        robot.delay(1000);
        robot.keyRelease(65);
        robot.delay(1000);
        robot.keyPress(76);
        robot.delay(1000);
        robot.keyRelease(76);
        robot.delay(1000);
        robot.keyPress(10);
        robot.delay(1000);
        robot.keyPress(10);
    }
}