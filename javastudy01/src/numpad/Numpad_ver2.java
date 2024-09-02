package numpad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class Numpad_ver2 extends JFrame {

    public Numpad_ver2() {
        setTitle("CapsLock and Num Listener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);

        // Set up Key Bindings
        setupKeyBindings();
    }

    private void setupKeyBindings() {
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getRootPane().getActionMap();

        // Define actions for keys
        inputMap.put(KeyStroke.getKeyStroke("pressed J"), "capsLockJ");
        actionMap.put("capsLockJ", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_1);
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("pressed K"), "capsLockK");
        actionMap.put("capsLockK", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_2);
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("pressed L"), "capsLockL");
        actionMap.put("capsLockL", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_3);
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("pressed U"), "capsLockU");
        actionMap.put("capsLockU", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_4);
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("pressed I"), "capsLockI");
        actionMap.put("capsLockI", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_5);
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("pressed O"), "capsLockO");
        actionMap.put("capsLockO", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
                    simulateKeyPress(KeyEvent.VK_6);
                }
            }
        });
    }

    private void simulateKeyPress(int keyCode) {
        try {
            Robot robot = new Robot();
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Numpad::new);
    }
}