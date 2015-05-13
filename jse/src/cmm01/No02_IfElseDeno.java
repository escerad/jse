package cmm01;

import java.util.Scanner; //대문자로 바뀌면서 객체가 됩니당.

public class No02_IfElseDeno {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//scanf이거랑 같은거 알지. 위의 scanner은 그런 개념이야.
		System.out.print("값을 입력하세요 :");
		int i = 0;
		
		i=scanner.nextInt();
		
		System.out.println("i의 값은 "+ i +"입니다.");
	}
}
