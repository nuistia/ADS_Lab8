/*
Додати в стек цілі числа від 1 до 45.
Всі числа з стека витягувати по одному і додавати в чергу.
Числа з черги виймати по одному і парні друкувати
*/

import java.util.*;

public class Main {

    static void fillQueue(Stack<Integer> stack, Deque<Integer> queue) {
        int i = 0;
        int s = stack.size();
        while (i < s) {
            queue.add(stack.pop());
            i++;
        }
    }

    static void evenNumbers(Deque<Integer> queue) {
        int i = 0;
        int s = queue.size();
        while (i < s) {
            if (queue.getFirst() % 2 == 0) {
                System.out.print((queue.poll()) + " ");
            } else {
                queue.poll();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.print("Введіть розмір стеку: ");
        int count;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();

        System.out.println("Додавайте у стек цілі числа від 1 до 45:");
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < count) {
            stack.push(scan.nextInt());
            i++;
        }

        System.out.println("Ваш стек виглядає так:");
        System.out.println(stack);

        Deque<Integer> deque = new ArrayDeque<>();
        fillQueue(stack, deque);
        System.out.println("Ваша черга виглядає так:");
        System.out.println(deque);

        System.out.println("Парні числа черги:");
        evenNumbers(deque);
    }
}