package Day2PracticeProblems;
public class SpringSeason {
    public static void main(String[] args) {
        // Checking if the number of command-line arguments is correct
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        // Parsing the command-line arguments as integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking if the date is within the spring season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                (month >= 4 && month <= 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);

        // Printing the result
        System.out.println(isSpring);
    }
}
