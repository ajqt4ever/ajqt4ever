public class StackExample {
    private static final int MAX_SIZE = 10;
    private int top;
    private int[] stackArray;

    // Constructor
    public StackExample() {
        this.top = -1; // Stack is initially empty
        this.stackArray = new int[MAX_SIZE];
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow. Cannot push " + value + ". Stack is full.");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto the stack.");
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
        } else {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack.");
        }
    }

    // Method to display the elements of the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a stack
        StackExample stack = new StackExample();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Display the stack
        stack.display();

        // Pop an element from the stack
        stack.pop();

        // Display the stack after popping
        stack.display();
    }
}
