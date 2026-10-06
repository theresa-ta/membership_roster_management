import java.util.ArrayList;

public class Member_Roster {
    private ArrayList <Member> memberList = new ArrayList<>();


    public void add(String memberID, String firstName, String lastName, String email, int age, int monthlyVisit1, int monthlyVisit2, int monthlyVisit3){
        int[] monthlyVisits = {monthlyVisit1, monthlyVisit2, monthlyVisit3};
        Member member = new Member(memberID, firstName, lastName, email, age, monthlyVisits);
        memberList.add(member);
    }
}
