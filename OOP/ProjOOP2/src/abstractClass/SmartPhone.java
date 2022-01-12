package abstractClass;

import java.util.ArrayList;

public class SmartPhone extends Phone {

    ArrayList<String> contactsName = new ArrayList<>();
    ArrayList<String> contactsNum = new ArrayList<>();

    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("Search On The Internet ☆☆");
    }

    public void addContacts(String name, String number){
        contactsName.add(name);
        contactsNum.add(number);
    }

}
