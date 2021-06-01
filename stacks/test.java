import java.util.LinkedList;
import java.util.Queue;

class test {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            queue.add(i + 1);

        System.out.println("Elements of queue " + queue);

        int removedele = queue.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(queue);
    }
}
