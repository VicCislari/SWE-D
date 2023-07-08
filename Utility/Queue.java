package Utility;

import java.util.ArrayList;

public class Queue {
    private ArrayList<String> queue = new ArrayList<String>();

    public Queue(){
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");
    }

    public String getNextElement(){
        int length_old = queue.size();
        assert(length_old > 0) : "Pre-Condition failed. queue is empty. Queue";

        String element = queue.remove(0);
        int length_new = queue.size();
        assert ((length_new +1) == length_old): "something went wrong. Post Condition failed. Queue";

        System.out.println(element);
        return element;
    }

}
