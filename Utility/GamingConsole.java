package Utility;

import java.util.ArrayList;

public class GamingConsole {
    private ArrayList<Controller> Controllers = new ArrayList<Controller>();

    public void addController(Controller controller){
        assert (controller!=null && !Controllers.contains(controller) && 2<=Controllers.size() && Controllers.size()<4):"Pre-Condition failed. addController()";
        int length_old = Controllers.size();
        Controllers.add(controller);
        int length_new = Controllers.size();
        assert ((length_old + 1) == length_new && Controllers.contains(controller)):"Post-Condition failed. addController()";

    }

    public void removeController(Controller controller){
        assert (controller!=null && Controllers.contains(controller) && 2<Controllers.size() && Controllers.size()<=4):"Pre-Condition failed. addController()";
        int length_old = Controllers.size();
        Controllers.remove(controller);
        int length_new = Controllers.size();
        assert ((length_old - 1) == length_new && !Controllers.contains(controller)):"Post-Condition failed. addController()";


    }
}
