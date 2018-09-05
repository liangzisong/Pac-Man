package man;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PacMan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//行
		int manRow = 0;
		//列
		int manList = 14;
		//移动方向
		String move = "wu";
        //初始化
		String[][] str = new String[15][15];
		for(int i=0;i<str.length;i++) {
			for (int j=0;j<str.length;j++) {
//				if(i/2==0){
//					List<Integer> list = getDiffNO(15);
////					int Random1 = new Random().nextInt(15);
//					str[list.get(0)][list.get(1)]="@ ";
//					//continue;
//				}
				
				str[i][j]="* ";
			}
		}
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
    		boolean b = false;
    		if(manRow == 15) {
				manRow = 13;
			}
    		if(manList == 15) {
    			manList = 13;
			}
    		str[manList][manRow]="c ";
    		for(int i=0;i<str.length;i++) {
    			for (int j=0;j<str.length;j++) {
    				if (!"@ ".equals(str[i][j])) {
    					if(i==str.length-1&&j==str.length-1) {
        					System.out.println("if (\"@ \".equals(str[i][j])) {");
        					List<Integer> list = getDiffNO(15);
//        					int Random1 = new Random().nextInt(15);
        					str[list.get(0)][list.get(1)]="@ ";
        					break;
    					}

    				}
    			}
    		}
    		for(int i=0;i<str.length;i++) {
    			for (int j=0;j<str.length;j++) {
    				//1
					if("d".equals(move) && b==false) {
						if(manRow >= 14) {
							manRow = 13;
						}
						manRow++;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="c ";
						//消影
						str[manList][manRow-1]="* ";
						move = "d";
						b=true;
					}
					//2
					if("w".equals(move) && b==false) {
						if(manList <= 0) {
							manList = 1;
						}
						manList--;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="u ";
						str[manList+1][manRow]="* ";
						move = "w";
						b=true;
					}
					//3
					if("a".equals(move) && b==false) {
						if(manRow <= 0) {
							manRow = 1;
						}
						manRow--;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="D ";
						str[manList][manRow+1]="* ";
						move = "a";
						b=true;
					}
					//4
					if("s".equals(move) && b==false) {
						if(manList >= 14) {
							manList = 13;
						}
						manList++;
						System.out.println("manRow="+manRow);
						str[manList][manRow]="n ";
						str[manList-1][manRow]="* ";
						move = "s";
						b=true;
					}
    			System.out.print(str[i][j]);
    			//str[manList][manRow]="* ";
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
    public static List<Integer> getDiffNO(int n){
    	Random r = new Random();
    	List<Integer> list = new ArrayList<Integer>();
        int i;
        while(list.size() < 15){
            i = r.nextInt(15);
            if(!list.contains(i)){
                list.add(i);
            }
        }
		return list;
    }
}
