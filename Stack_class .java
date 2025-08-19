import java.util.Stack;
public class Stack_class {
        int top;
		int cap;
		int[] stack;
		Stack s=new Stack();
		Stack_class(int size){
			cap=size;
			top=-1;
			stack=new int[cap];
		}
		void push(int value) {
			if(top==cap-1) {
				System.out.println("Stack overflow");
				return ;
			}
			stack[++top]=value;
		}
		
		int pop() {
			if(top == -1) {
				System.out.println("underflow Error");
				return -1;
			}
				int popvalue=stack[top--];
				System.out.println(popvalue+" poped value");
				return popvalue;
		}
		int peek() {
			if(top==-1) {
				System.out.println("Stack is empty");
				return -1;
			}
			return stack[top];
		}
		boolean isEmpty() {
			return top == -1;
		}
		
		void display() {
			if(isEmpty()) {
				System.out.println("Stack is empty..");
				return;
			}
			
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]+" ");
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			Stack_class ss=new Stack_class(5);
			ss.push(34);
			ss.push(23);ss.push(99);
			ss.display();
			
			System.out.println(ss.peek());
		}
	}



