import java.util.Scanner;

public class Member_Main {
    public static void main(String[] args) {
    String[] members = {
            "1,Brian, Davis, Brian.Davis1989@gmail.com,37, 26, 20, 23",
            "2,Jessica, Hendricks, Hendricks1994@gmail.com,32, 25, 22, 6",
            "3,Gerald, Rivian, The_drifter2001@yahoo.com,25, 30, 27, 2",
            "4,Miranda, Greene, Miranda.greene@comcast.net,26, 19, 16, 21",
            "5,[firstname],[lastname],[emailaddress],[age],[threemonthlyvisits]"
    };

    Member_Roster roster = new Member_Roster();

    for (int i = 0; i < members.length; i++) {
        String[] data = members[i].split(",");

        roster.add(
                data[0].trim(),
                data[1].trim(),
                data[2].trim(),
                data[3].trim(),
                Integer.parseInt(data[4].trim()),
                Integer.parseInt(data[5].trim()),
                Integer.parseInt(data[6].trim()),
                Integer.parseInt(data[7].trim()),
        );
    }

    roster.print_all();
}
