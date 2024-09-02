package numpad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numpad_ver1 extends JFrame implements KeyListener {

    private Robot robot;

    public Numpad_ver1() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        setTitle("CapsLock and Num Listener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        boolean capsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);

        switch (e.getKeyCode()) {
            case KeyEvent.VK_J:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_1);
                break;
            case KeyEvent.VK_K:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_2);
                break;
            case KeyEvent.VK_L:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_3);
                break;
            case KeyEvent.VK_U:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_4);
                break;
            case KeyEvent.VK_I:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_5);
                break;
            case KeyEvent.VK_O:
                if (capsLockOn) simulateKeyPress(KeyEvent.VK_6);
                break;
        }
    }

    private void simulateKeyPress(int keyCode) {
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Numpad_ver1::new);
    }
}
