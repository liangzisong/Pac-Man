package man;

public class Test {

	public static void main(String[] args) {
		String[][] str = new String[15][15];
		for(int i=0;i<str.length;i++) {
			for (int j=0;j<str.length;j++) {
				str[i][j]="* ";
			}
		}
		str[14][0]="c ";
		for(int i=0;i<str.length;i++) {
			for (int j=0;j<str.length;j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}
}
