package ch10;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
    public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member(){};

    // prevent duplicates
    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member)o;
            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "'s ID is " + memberId;
    }

//    // compareTo to Comparable
//    @Override
//    public int compareTo(Member member) {
//        // compare with this (coming) data and existing data in tree
//        // ASC
//        /*
//        if (this.memberId > member.memberId) {
//            return 1;
//        } else if (this.memberId < member.memberId) {
//            return -1;
//        } else {
//            return 0;
//        }
//         */
//        return (this.memberId - member.memberId);
//    }
    // compare to Comparator
    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }
}
