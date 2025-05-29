public class Main {
    public static void main(String[] args) {
        StackLinkedList <Number>stack = new StackLinkedList<> ();
        stack.push(item:3);
        stack.push(item:45);
        stack.push(item:3.4);
        //stack.push(item:"This is a test");
        System.out.println(stack);
        stack.displayStack();
        try {
            stack.pop();
        }catch (Exception e){

            System.out.println();}

        stack.pop();

        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();
    }
}