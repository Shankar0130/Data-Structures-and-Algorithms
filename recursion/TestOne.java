import java.util.LinkedList;
import java.util.List;

class TestOne {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        for (int i = 0; i < list.size(); i = i + 2) {
            System.out.print(list.get(i) + " ");
        }

    }
}
