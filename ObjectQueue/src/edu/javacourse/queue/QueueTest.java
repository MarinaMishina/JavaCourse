package edu.javacourse.queue;

import edu.javacourse.queue.exception.EmptyQueueException;
import edu.javacourse.queue.exception.NoSuchIndexException;


public class QueueTest {

    public static void main(String[] arg) {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 10; i++) {
            // В данном случае мы складываем в очередь строки
            queue.push("Строка:" + i);
        }

        showString(11, queue);
    }

    public static void showString(int index, ObjectQueue q) {
        try {
            String s = (String) q.get(index);
            System.out.println(s);
            System.out.println("===============");
            

        } catch (EmptyQueueException | NoSuchIndexException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unknown exception" + ex.getLocalizedMessage());
        } 
        
        while (q.size() > 0) {
                String s = (String) q.pull();
                System.out.println(s);
                System.out.println("Размер очереди:" + q.size());
            }
    }

}
