package java2lesson3;
import java.util.ArrayList;

public class PhoneRecord {

    private String name;
    private ArrayList<String> phones;

    PhoneRecord(String name){
        this.name = name;
        this.phones = new ArrayList<>();
    }

    public void addPhone(String newPhone){
        phones.add(newPhone);
    }

    public String getName(){
        return name;
    }

    public ArrayList<String> getPhones(){
        return phones;
    }

    @Override
    public String toString(){
        return name + ":" + String.join(", ", phones);
    }
}
