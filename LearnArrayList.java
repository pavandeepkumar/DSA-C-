import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * LearnArrayList
 */
public class LearnArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(95);
        list.add(45);
        list.add(45);
        list.add(45);
        list.remove(0);
        list.addAll(list2);
        System.out.println("list new after combing" + list);
        list.removeAll(list2);
        System.out.println("list new after combing" + list);
        list.sort(null);
        System.out.println(list);
        System.out.println("size" + list.size());
        Stack<String> stackList = new Stack<>();
        stackList.push("pavan");
        stackList.push("Sharma");
        System.out.println("Stacklist" + stackList);
        stackList.peek();
        System.out.println("Stacklist" + stackList.peek());
        System.out.println("stack" + stackList);

        LinkedList<String> linkList = new LinkedList<>();
        linkList.offer("dfgn");
        linkList.offer("dfgh");
        System.out.println("linkList: " + linkList);
        System.out.println(linkList.poll());

    }
}