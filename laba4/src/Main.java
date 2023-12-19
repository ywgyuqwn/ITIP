import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

class CustomEmptyStackException extends Exception {
    public CustomEmptyStackException(String message) {
        super(message);
    }
}

class CustomStack {
    private int[] stack;
    private int top;

    public CustomStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int element) {
        stack[++top] = element;
    }

    public int pop() throws CustomEmptyStackException {
        if (top == -1) {
            throw new CustomEmptyStackException("Stack is empty");
        }
        return stack[top--];
    }
}

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("log.txt", true);

            stack.push(1);
            stack.push(2);
            stack.push(3);

            for (int i = 0; i < 4; i++) {
                try {
                    int element = stack.pop();
                    System.out.println("Popped element: " + element);
                } catch (CustomEmptyStackException e) {
                    fileWriter.write(LocalDateTime.now() + " - " + e.getMessage() + "\n");
                    fileWriter.flush();
                    System.out.println("Exception logged to file: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file writer.");
            }
        }
    }
}


