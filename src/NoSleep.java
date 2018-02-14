import java.awt.*;
import java.util.*;
/**
 *  Keep your computer from going to sleep by moving the
 *  mouse to some random position on your screen every 2 minutes
 */
public class NoSleep {
    public static void main(String[] args) throws Exception{
        // New robot object
        Robot hal = new Robot();
        // Random obj
        Random random = new Random();
        while(true){
            // 2 minute delay
            hal.delay(1000 * 120);
            // Pick 2 random x/y positions
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            // Move the mouse
            hal.mouseMove(x,y);
        }
    }

}
