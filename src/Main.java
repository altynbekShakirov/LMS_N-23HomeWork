import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Sort sort = new Sort();
        Random random = new Random();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Sort Array~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~Sort Array List~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 5; i++) {
            int ran = random.nextInt(0, 2);
            arrayList.add(ran);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~Sort Linked List~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 5; i++) {
            int ran = random.nextInt(0, 2);
            linkedList.add(ran);
        }
        Collections.sort(linkedList);
        System.out.println(linkedList);

    }


}