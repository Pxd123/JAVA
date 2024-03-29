import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x=100;//小球横坐标
	double y=100;//纵
	
	double degree = 3.14/3; //弧度。此处就是角度：60度
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x, (int)y, null);
		
	
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);

		//碰到上下边界反弹
		if(y>500-40-30||y<40+40) {//500是窗口的高度；40是桌子下边框宽度，30是球直径；最后一个40是标题栏高度
			degree=-degree;
		}
		//碰到左右边界反弹
		if(x<40||x>856-40-30) {
			degree=3.14-degree;
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
		BallGame2 game = new BallGame2();
		game.launchFrame();
		
	}
}
