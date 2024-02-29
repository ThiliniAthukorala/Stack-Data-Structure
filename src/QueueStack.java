import javax.sound.midi.MidiFileFormat;

public class QueueStack {

    Stack s1;
    Stack s2;
    public QueueStack() {
        this.s1 = new Stack();
        this.s2 = new Stack();
    }

    void enqueue(int data) {
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Can not dequeue");
            return;
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.pop();
    }


    public  void display(){
        if (s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
        }

        if (s1.isEmpty()){
            while (!s2.isEmpty()){
                System.out.print(s2.pop()+" ");
            }
        }

        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            System.out.print(s2.pop()+" ");
        }


    }
}


  /*  public void display(){
        if (!s1.isEmpty()){
            s1.travse();
        }else {
            s2.travse();
        }
    }*/


