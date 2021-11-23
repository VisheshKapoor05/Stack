package Stack_Queues;

public class StackDemo {

	public static void main(String[] args) {
		
		Stacks stack = new Stacks();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		stack.show();
		System.out.println("");
		stack.pop();
		
		stack.show();

	}

}
