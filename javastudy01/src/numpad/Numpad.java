package numpad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * 제작일 : 240829
 * 만든이 : 001cloudid
 * 만든이유 : 내가 프로그래밍에 관심을 가지게 된 계기가
 * 			내가 필요로 하는 것을 만들고 싶다.
 * 			지식을 이용해서 문제를 해결해보고 싶다는 생각을 하게 됨. 
 * 			따라서 초심 찾기를 위해 만들기로 마음 먹음
 * 참고사항 : 내가 알고 사용하는 클래스는 극히 소수이기 때문에
 * 			다양한 곳에서 참고함
 */


public class Numpad extends JFrame implements KeyListener {

	//java.awt.event.KeyListener : 키보드를 눌렀을 때 호출되는 메소드를 가지고 있는 인터페이스
	//javax.swing.JFrame : 윈도우를 띄울 때 나타내는 클래스
	
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
