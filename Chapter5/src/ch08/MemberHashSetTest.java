package ch08;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member Lee = new Member(1001, "Lee");
        Member Kim = new Member(1002, "Kim");
        Member Park = new Member(1003, "Park");
        Member Yun = new Member(1004, "Yun");

        memberHashSet.addMember(Lee);
        memberHashSet.addMember(Kim);
        memberHashSet.addMember(Park);
        memberHashSet.addMember(Yun);

        memberHashSet.showAll();
        Member Park2 = new Member(1003, "Park");
        memberHashSet.addMember(Park2);

        memberHashSet.showAll();
        /*
        memberHashSet.removeMember(Kim.getMemberId());
        memberHashSet.removeMember(1005);
        memberHashSet.showAll();


         */
    }
}
