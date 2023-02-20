package ch10;


import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member Lee = new Member(1001, "Lee");
        Member Kim = new Member(1002, "Kim");
        Member Park = new Member(1003, "Park");
        Member Yun = new Member(1004, "Yun");

        memberHashMap.addMember(Lee);
        memberHashMap.addMember(Kim);
        memberHashMap.addMember(Park);
        memberHashMap.addMember(Yun);

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Yun");
        hashMap.put(1005, "Hong");

        System.out.println(hashMap.toString());
    }
}
