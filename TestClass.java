import java.util.*;

public class TestClass {
    static private LenderManagement lenderManagement = new LenderManagement();
    public static void main(String[] args) {
        lenderManagement.createLender(
            "Dima", 
            "1234", 
            "L0001", 
            "Real-address-straße", 
            "+49 1234567890"
        );

        lenderManagement.createLender(
            "Vova", 
            "4321", 
            "L0002", 
            "Fake-address-straße", 
            "+49 0987654321"
        );

        lenderManagement.createLender(
            "Boris", 
            "9876", 
            "L0003", 
            "Any-address-straße", 
            "+49 6574839190"
        );
    
        
        Lender lender = lenderManagement.searchLender("L0002");
        if (lender != null) {
            System.out.println("Found lender! Fullname: " + 
                lender.getFullname());
        }

        lenderManagement.deleteLender("L0001");

        Iterator<Lender> it = lenderManagement.getLenders().iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
