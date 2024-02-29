public class Stack {
  StackNode top;
  int capacity;


    public Stack() {
        this.top =null;
        this.capacity=0;
    }
     boolean isEmpty(){
        if (this.top==null){
            return true;
        }else {
            return false;
        }
    }
   public void push(int data){
        StackNode stack=new StackNode(data);

        if (isEmpty()){
            this.top=stack;
            capacity++;
            return;
        }
        capacity++;
        stack.next=this.top;
        this.top=stack;
    }

   public int pop(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }else {
            int data=top.data;
            StackNode stack=top.next;
            top=stack;
            capacity--;
            return  data;

        }

    }

   /* public void travse(){
        StackNode temp=this.top;
        while(temp!=null) {
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }*/

}
