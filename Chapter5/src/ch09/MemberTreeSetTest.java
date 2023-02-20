package ch09;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1); // DESC
    }
}
public class MemberTreeSetTest {
    public static void main(String[] args) {
        /*
        TreeSet set = new TreeSet<String>();
        set.add("Lee");
        set.add("Kim");
        set.add("Park");
        set.add("Yun");

        System.out.println(set);
         */
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member Lee = new Member(1001, "Lee");
        Member Kim = new Member(1002, "Kim");
        Member Park = new Member(1003, "Park");
        Member Yun = new Member(1004, "Yun");

        memberTreeSet.addMember(Lee);
        memberTreeSet.addMember(Kim);
        memberTreeSet.addMember(Park);
        memberTreeSet.addMember(Yun);

        memberTreeSet.showAll();

//        Member Park2 = new Member(1003, "Park");
//        memberTreeSet.addMember(Park2);
//
//        memberTreeSet.showAll();


        // comparable and comparator
        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("Lee");
        set.add("Kim");
        set.add("Park");
        set.add("Yun");
        System.out.println(set);
    }
}
