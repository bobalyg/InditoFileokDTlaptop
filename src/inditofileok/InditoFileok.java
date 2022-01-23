/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inditofileok;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Bobály Gábor
 */
public class InditoFileok {

    public static final int varakozas5 = 5000; //5 másodperc
    public static final int varakozas10 = 10000; //10 másodperc
    public static final int varakozas30 = 30000; // fél perc
    public static final int varakozas90 = 90000; // másfél perc
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
//        try {
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\table.txt");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\andromeda.txt.out");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\run.bat");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\AppData\\Roaming\\Microsoft\\Templates");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\GB.ahk");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\UjKezdetUj.xlsm");

//    Runtime.getRuntime().exec("C:\\Users\\Bobály Gábor\\Desktop\\WinFiol.txt");
//    Runtime.getRuntime().exec("C:\\Users\\Bobály Gábor\\Desktop\\Termés.xlsx");
//    Runtime.getRuntime().exec("C:\\Users\\Bobály Gábor\\Desktop\\VBA,Excel");
//    Runtime.getRuntime().exec("C:\\Users\\Bobály Gábor\\Desktop\\Gabi.ahk");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\GB.ahk");
//    Runtime.getRuntime().exec("C:\\Users\\A80309259\\Desktop\\UjKezdetUj.xlsm");
//} catch (Exception e) {
//    e.printStackTrace();
//} 
        // TODO code application logic here
        Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("C:\\Users\\A80309259\\AppData\\Roaming\\Microsoft\\Templates");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }

        try {
            Runtime.getRuntime().exec(new String[]{"c:\\windows\\notepad.exe", "C:\\Users\\A80309259\\Desktop\\andromeda.txt.out"});
            Runtime.getRuntime().exec(new String[]{"C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.EXE", "C:\\Users\\A80309259\\Desktop\\UjKezdetUj.xlsm"});
            Runtime.getRuntime().exec(new String[]{"c:\\windows\\notepad.exe", "C:\\Users\\A80309259\\Desktop\\table.txt"});
            Runtime.getRuntime().exec(new String[]{"c:\\Program Files\\AutoHotkey\\AutoHotkey.exe", "C:\\Users\\A80309259\\Desktop\\GB.ahk"});
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "run.bat");
        File dir = new File("C:\\Users\\Bobály Gábor\\Desktop\\");
        pb.directory(dir);
        Process p = pb.start();

        Thread.sleep(varakozas90);
        Robot robot = new Robot();

        Random random = new Random();
//outlook behuzása
        //peageant aktiválása
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_9);
        Thread.sleep(varakozas10);
        //outlook ablak maximalizálása
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_UP);

        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(varakozas5);

        //10. app a shortcutban az Internet Explorer annak indítása:
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(varakozas10);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_UP);

        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(varakozas5);

        //végül a teszt program indítása
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(varakozas5);

    }

}
