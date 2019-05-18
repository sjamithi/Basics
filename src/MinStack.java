public class MinStack {
    public class Elem {
        int value;
        int min;
        Elem next;
        Elem(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    private MinStack() {
    }

    private Elem top;

    private void push(int x) {
        if (top == null) {
            top = new Elem(x, x);
        } else {
            Elem e = new Elem(x, Math.min(x, top.min));
            e.next = top;
            top = e;
        }
    }

    private void pop() {
        if (top == null) {
            return;
        }
        Elem temp = top.next;
        top.next = null;
        top = temp;
    }

    private int top() {
        if (top == null) {
            return -1;
        }
        return top.value;
    }

    private int getMin() {
        if (top == null)
            return -1;
        return top.min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("min " + minStack.getMin());
        minStack.pop();
        System.out.println("top " + minStack.top());
        System.out.println("min " + minStack.getMin());
    }
}
