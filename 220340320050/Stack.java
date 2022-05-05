class Stack{
	int size;
	int top1,top2;
	int arr[];
	
	Stack(int k){
	arr = new int[k];
	size = k;
	top1 = -1;
	top2 = size;
	}
	
	void push_one(int x){
	if(top1 < top2 -1){
	top1++;
	arr[top1] = x;
	}
	else{
	System.out.println("Stack Overflow");
	System.exit(1);
	}
	} 
	
	void push_two(int x){
	if(top1 < top2 -1){
	top2--;
	arr[top2] = x;
	}
	else{
	System.out.println("Stack Overflow");
	System.exit(1);
	}
	}
	
	int pop_one(){
	if(top1 >= 0){
	int x = arr[top1];
	top1--;
	return x;
	}
	else{
	System.out.println("Stack Underflow");
	System.exit(1);
	}
	return 0;
	}
	
	int pop_two(){
	if(top2 < size){
	int x = arr[top2];
	top2++;
	return x;
	}
	else{
	System.out.println("Stack Underflow");
	System.exit(1);
	}
	return 0;
	}
	
	public static void main(String []args){
	Stack s = new Stack(5);
	s.push_one(5);
	s.push_two(10);
	s.push_two(15);
	s.push_one(11);
	s.push_two(7);
	System.out.println("Popped element from stack1 is "+s.pop_one());
	s.push_two(40);
	System.out.println("Popped element from stack2 is "+s.pop_two());
	}
}