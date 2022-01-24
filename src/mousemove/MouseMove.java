/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemove;

import java.awt.Robot;
import java.util.Random;

/**
 *
 * @author Bobály Gábor
 */
public class MouseMove {

   public static final int MIN = 550000;

    public static final int MAX_Y = 400;

    public static final int MAX_X = 400;

 

    /**

     * @param args the command line arguments

     */

     public static void main(String... args) throws Exception {

        Robot robot = new Robot();

        Random random = new Random();

        while (true) {

            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));

            Thread.sleep(MIN);

        }

    }
    
}
