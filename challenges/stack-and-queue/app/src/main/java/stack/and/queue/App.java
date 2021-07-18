/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App  {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());


        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.peek();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.dequeue();

    }
}
