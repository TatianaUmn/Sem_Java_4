
import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец
//  очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый
//  элемент из очереди, не удаляя.

public class SemFourTaskTwoDz {
    public static void main(String[] args) {
        int a;
        LinkedList<Integer> linkedls = new LinkedList<>();

        System.out.println("Введите количество элементов списка:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
            for (int i = 0; i <= a - 1; i++) {
                linkedls.add((int) (Math.random()*100));
            }
            System.out.println("Первоначальный список: " + linkedls);
            // System.out.println("\n");
            System.out.println("Список с новым элементом в конце очереди: ");
            enqueue(linkedls,12);
            System.out.println("Первое число в списке: ");
            dequeue(linkedls);
            System.out.println ("Список без первого числа: " + linkedls);
            System.out.println("Первое число в списке: ");
            first(linkedls);
            System.out.println ("Список с сохраненным первым числом: " + linkedls);
           
            in.close();
        }

        public static void enqueue (LinkedList<Integer> list, int number){
            list.add(number);
            System.out.println (list);
        }
        public static void dequeue(LinkedList<Integer> list){
            System.out.println (list.removeFirst());
        }
        public static void first(LinkedList<Integer> list){
                System.out.println (list.getFirst());
        }
            
}