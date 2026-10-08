import java.util.ArrayList;

public class Member_Roster {
    private ArrayList <Member> memberList = new ArrayList<>();


    public void add(String memberID, String firstName, String lastName, String email, int age, int monthlyVisit1, int monthlyVisit2, int monthlyVisit3){
        int[] monthlyVisits = {monthlyVisit1, monthlyVisit2, monthlyVisit3};
        Member member = new Member(memberID, firstName, lastName, email, age, monthlyVisits);
        memberList.add(member);
    }
    public void remove(String memberID){
        for (int i = 0;  i < memberList.size(); i++){
            if (memberList.get(i).getMemberID().equals(memberID)) {//get(i) != getter. get(i) is for arrayList to get index. getter is a method we created. not the same.
                memberList.remove(i);
                return;
            }
        }

        System.out.println("Member with ID " + memberID + " not found.");
    }
    public void print_all(){
        for (int i = 0; i < memberList.size(); i++){
            memberList.get(i).print();
        }
    }
}
