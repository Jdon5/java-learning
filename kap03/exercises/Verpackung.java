public class Verpackung {
    public static void main(String[] args) {
        //amount of bottles
        int flaschen = 23;

        // amouont of bottles a crate can withhold
        int karton = 12;


        // amount of crates which can filled with bottles
        System.out.println("Anzahl der gefüllten Kartons: " + (flaschen/karton));

        // remainder of bottles, which didn't fit in crates
        System.out.println("Anzahl der übrig geblieben Flaschen: "+(flaschen%karton));
    }
}