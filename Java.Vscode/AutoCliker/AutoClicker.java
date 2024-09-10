    import java.awt.Robot;
    import java.awt.event.KeyEvent;
    import java.awt.AWTException;

public class AutoClicker { // Nome da classe ajustado para seguir convenções Java
    
    public void robot() {
        try {

            Robot rb = new Robot();


            rb.keyPress(KeyEvent.VK_CONTROL);

            rb.delay(01);

            rb.keyRelease(KeyEvent.VK_CONTROL);

            rb.delay(500);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AutoClicker a = new AutoClicker();
        while (true) {
            a.robot();            
        }
    }
}
