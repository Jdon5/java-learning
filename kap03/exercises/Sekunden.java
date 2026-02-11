public class Sekunden {
    public static void main(String[] args) {
        // Amount of days in january
        int days = 31;

        // converting days into hours
        int daysIntoHours = days*24;

        // converting hours into minutes
        int hoursIntoMinutes  = daysIntoHours * 60;

        // converting minutes into seconds
        int minutesIntoSeconds = hoursIntoMinutes * 60;

        // printing out conversion of days into seconds
        System.out.println(days+ " Tage in Sekunden: " + minutesIntoSeconds);
    }
}