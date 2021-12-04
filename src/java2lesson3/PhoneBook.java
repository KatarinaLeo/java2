package java2lesson3;
import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<PhoneRecord> recordList;

    PhoneBook(){
        this.recordList = new ArrayList<>();
    }

    public ArrayList<String> getPhone(String name){
        ArrayList<String> answer = new ArrayList<>();
        for (PhoneRecord record: recordList) {
            if (record.getName().equals(name)){
                answer = record.getPhones();
            }
        }
        return answer;
    }

    public void addRecord(String name, String phone){
        boolean resultRecord = true;
        for(PhoneRecord record: recordList){
            if(record.getName().equals(name)){
                record.addPhone(phone);
                resultRecord = false;
            }
        }
        if(resultRecord) {
            PhoneRecord newRecord = new PhoneRecord(name);
            newRecord.addPhone(phone);
            recordList.add(newRecord);
        }
    }

    void infoMyBook(){
        for(PhoneRecord record: recordList) {
            System.out.println(record);
        }
    }
}
