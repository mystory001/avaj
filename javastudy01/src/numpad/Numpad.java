package numpad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * ������ : 240829
 * ������ : 001cloudid
 * �������� : ���� ���α׷��ֿ� ������ ������ �� ��Ⱑ
 * 			���� �ʿ�� �ϴ� ���� ����� �ʹ�.
 * 			������ �̿��ؼ� ������ �ذ��غ��� �ʹٴ� ������ �ϰ� ��. 
 * 			���� �ʽ� ã�⸦ ���� ������ ���� ����
 * ������� : ���� �˰� ����ϴ� Ŭ������ ���� �Ҽ��̱� ������
 * 			�پ��� ������ ������
 */


public class Numpad extends JFrame implements KeyListener {

	//java.awt.event.KeyListener : Ű���带 ������ �� ȣ��Ǵ� �޼ҵ带 ������ �ִ� �������̽�
	//javax.swing.JFrame : �����츦 ��� �� ��Ÿ���� Ŭ����
	
	private boolean capsLockOn = false;
	
    public Numpad() {
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
		capsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_J) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_1);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_K) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_L) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_U) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_4);
				robot.keyRelease(KeyEvent.VK_4);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_I) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_5);
				robot.keyRelease(KeyEvent.VK_5);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
		if(capsLockOn && e.getKeyCode()==KeyEvent.VK_O) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_6);
				robot.keyRelease(KeyEvent.VK_6);
			} catch (AWTException ex) {
				ex.printStackTrace();
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(()->new Numpad());
		
	}
	
}
