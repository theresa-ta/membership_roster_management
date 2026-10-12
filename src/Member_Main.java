public class Member_Main {
    public static void main(String[] args) {
        String[] members = {
                "1,Brian, Davis, Brian.Davis1989@gmail.com,37, 26, 20, 23",
                "2,Jessica, Hendricks, Hendricks1994@gmail.com,32, 25, 22, 6",
                "3,Gerald, Rivian, The_drifter2001@yahoo.com,25, 30, 27, 2",
                "4,Miranda, Greene, Miranda.greene@comcast.net,26, 19, 16, 21",
                "5,Theresa,Ta,tta13@wgu.edu,26,10,15,12"
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
                    Integer.parseInt(data[7].trim())
                    );
        }

        roster.print_all();

        roster.print_invalid_emails();

        for (int i = 0; i < members.length; i++) {
            String[] data = members[i].split(",");
            roster.print_average_monthly_visits(data[0].trim());
        }

        roster.remove("3");
        roster.remove("3");
    }
}
