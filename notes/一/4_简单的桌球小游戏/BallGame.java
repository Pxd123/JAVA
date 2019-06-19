import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x=100;//小球横坐标
	double y=100;//纵
	boolean right = true;//方向
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x, (int)y, null);
		
		if(right) {//向右移动
			x=x+8;
		}else {//向左移动
			x=x-8;
		}
		
		if (x>856-40-30) {//856是窗口宽度，40是桌子边框宽度，30是小球直径
			right=false;			
		}
		
		if (x<40) {//40是桌子左边边框宽度
			right=true;			
		}		
	}
	
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口,每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms，1s=1000ms，大约一秒画20次				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//main方法是程序的入口
	public static void main(String[] args) {
		System.out.println("这是一个激发学习兴趣的小游戏。");
		BallGame game = new BallGame();
		game.launchFrame();
		
	}
}
