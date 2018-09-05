package man;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class PacMan {

	public static void main(String[] args) {
		StringBuffer background = new StringBuffer("* * * * * * * * * * * * * * *");
		Scanner input = new Scanner(System.in);
        while (true) {
        	Robot r = null;
        	 try {
				r=new Robot();
				//r.setAutoDelay(1000);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	r.keyPress(KeyEvent.VK_ENTER);
            //利用nextXXX()方法输出内容
            String str = input.nextLine();
            System.out.print("str="+str);
    		for(int i=0;i<15;i++) {
    			for(int j=0;j<15;j++) {
    				System.out.print("* ");
    			}
    			/*if(i==14) {
    				background.replace(0, 1, "c");
    			}*/
    			System.out.println("*");
    		}
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		clear();
        }

		//clear();
	}
	
	
	
	public static void clear(){
        for(int i=0;i<30;i++) {
        	System.out.println();
        }

    }
}
