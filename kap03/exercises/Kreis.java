public class Kreis {
    public static void main(String[] args) {

        // diameter of a given circle
        int durchmesser = 50;

        // pi
        double pi = 3.14159;

        // calculate circular area
        double kreisFläche = pi * (durchmesser/2)  * (durchmesser/2);

        //print out circular area
        System.out.println("Bei einem Durchmesser von "+durchmesser+ " LE, beträgt die Kreisfläche: "+ kreisFläche+" FE");
    }
}