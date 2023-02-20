package ch09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;
//    public MemberTreeSet() {
//        treeSet = new TreeSet<>();
//    }

    // need target(Member) to compare from Comparator with default constructor
    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {

        // Iterator
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + " doesn't exist.");
        return false;

    }

    public void showAll() {
        for (Member member:treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
