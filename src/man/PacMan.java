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
		//行
		int manRow = 0;
		//列
		int manList = 14;
		String move = "wu";
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
    		System.out.println("move="+move);
    			switch (in) {
				case "d":
					move = "d";
					break;
				case "w":
					move = "w";
					break;
				case "s":
					move = "s";
					break;
				case "a":
					move = "a";
					break;

				default:
					break;
				}
    		boolean db = false,ab = false,sb = false,wb = false;
    		if(manRow == 15) {
				manRow = 13;
			}
    		if(manList == 15) {
    			manList = 13;
			}
    		str[manList][manRow]="c ";
    		
    		for(int i=0;i<str.length;i++) {
    			for (int j=0;j<str.length;j++) {
    				//1
					if("d".equals(move) && db==false) {
						if(manRow >= 14) {
							manRow = 13;
						}
						manRow++;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="c ";
						move = "d";
						db=true;
					}
					//2
					if("w".equals(move) && wb==false) {
						if(manList <= 0) {
							manList = 1;
						}
						manList--;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="c ";
						move = "w";
						wb=true;
					}
					//3
					if("a".equals(move) && ab==false) {
						if(manRow <= 0) {
							manRow = 1;
						}
						manRow--;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="c ";
						move = "a";
						ab=true;
					}
					//4
					if("s".equals(move) && sb==false) {
						if(manList >= 14) {
							manList = 13;
						}
						manList++;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="c ";
						move = "s";
						sb=true;
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
	
	public static void a() {
		
	}
	
	public static void clear(){
        for(int i=0;i<30;i++) {
        	System.out.println();
        }

    }
}
