package HW4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook1 {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook1 phoneBook1 = new PhoneBook1();
        phoneBook1.add("Sedov", "234234");
        phoneBook1.add("Sedov", "123459");
        phoneBook1.add("Petrov", "253472");
        phoneBook1.add("Ivanov", "123456");

        System.out.println("Номера телефонов Sedova: " + phoneBook1.get("Sedov"));
    }
}