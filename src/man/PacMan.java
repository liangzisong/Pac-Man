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
            String in = input.nextLine();
            System.out.print("str="+in);
            //初始化
    		String[][] str = new String[15][15];
    		for(int i=0;i<str.length;i++) {
    			for (int j=0;j<str.length;j++) {
    				str[i][j]="* ";
    			}
    		}
    		str[14][0]="c ";
    		for(int i=0;i<str.length;i++) {
    			for (int j=0;j<str.length;j++) {
				if("d".equals(in)) {
					
				}
    			System.out.print(str[i][j]);
    			}
    			System.out.println();
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
