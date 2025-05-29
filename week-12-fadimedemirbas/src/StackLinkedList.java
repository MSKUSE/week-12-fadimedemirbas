public class StackLinkedList <T>implements Stack{

    StackItem<T>top;
    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        StackItem <T>previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public Object pop() {
        T tempData = top.getData();
        top = top.getNext();
        return  tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {return this.top == null;
        public void displayStack(){
            if(this.isEmpty()){
                System.out.println("This stack is empty!!!");
            }else {
                do {
                    System.out.println(tempNode.getData());
                }while(tempNode.get.next()) != null;
                }
            }

        }
    }


    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}
