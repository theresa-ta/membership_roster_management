public class Member {
    private String memberID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] monthlyVisits = new int[3];

    public Member(String memberID, String firstName, String lastName, String email, int age, int[] monthlyVisits){
        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.monthlyVisits = monthlyVisits;
    }

    public void setMemberID(String memberID){
        this.memberID = memberID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMonthlyVisits(int[] monthlyVisits){
        this.monthlyVisits = monthlyVisits;
    }

    public String getMemberID(){
        return memberID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }
    public int[] getMonthlyVisits(){
        return monthlyVisits;
    }

    public void print(){
        System.out.println(getMemberID() + "\t" +
                "First name: " + getFirstName() + "\t" +
                "Last name: " + getLastName() + "\t" +
                "Email: " + getEmail() + "\t" +
                "Age: " + getAge() + "\t" +
                "Monthly Visits: " + getMonthlyVisits()[0] + ", " + getMonthlyVisits()[1] + ", " + getMonthlyVisits()[2]);
    }

    //completed: 6 private fields, constructor with 6 parameters, this. to each field, 6 getters, 6 setters, print() method, monthly  visit array



}
