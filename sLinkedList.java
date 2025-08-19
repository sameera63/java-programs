class sLinkedList {
class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	void insert(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	void insertAtfront(int value) {
		Node newNode=new Node(value);
			if(head==null) {
			 head=newNode;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
		}

		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("null");
	}
public static void main(String args[]) {
				sLinkedList sll=new sLinkedList();
				sll.insert(10);
				sll.insert(20);
				sll.insert(30);
				sll.insertAtfront(22);
				sll.display();
			}
		}
 
			
	
	


