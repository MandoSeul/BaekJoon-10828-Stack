import java.util.Scanner;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		
		Stack<Integer> sk  = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while(i--!=0) {
			String str = sc.next();
			if(str.equals("push")) {
				int j = sc.nextInt();
				sk.push(j);
				}
			else if(str.equals("top")){
				if(!sk.empty())
					System.out.println(sk.peek());
				else
					System.out.println("-1");
			}
			else if(str.equals("size"))
				System.out.println(sk.size());
			else if(str.equals("empty")) {
				int temp = sk.empty()? 1: 0;
				System.out.println(temp);
			}
			else if(str.equals("pop")) {
				if(!sk.empty())
					System.out.println(sk.pop());
				else
					System.out.println("-1");
			}
		}
		
		sc.close();

}

}
