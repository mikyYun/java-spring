package ch07;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member lee = new Member(1001, "Lee");
        Member Kim = new Member(1002, "Kim");
        Member Park = new Member(1003, "Park");
        Member Yun = new Member(1004, "Yun");

        memberArrayList.addMember(lee);
        memberArrayList.addMember(Kim);
        memberArrayList.addMember(Park);
        memberArrayList.addMember(Yun);

        memberArrayList.showAll();

        memberArrayList.removeMember(Kim.getMemberId());
        memberArrayList.removeMember(1005);
        memberArrayList.showAll();
    }
}
