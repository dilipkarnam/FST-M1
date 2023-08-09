package Activities;

public class Activity3 {
    public static void main(String[] args) {

        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        System.out.println("Age on Mercury :" + seconds / MercurySeconds + " Days");
        System.out.println("Age on Venus :" + seconds / VenusSeconds + " Days");
        System.out.println("Age on " + "Earth :" + seconds / EarthSeconds+ " Days");
        System.out.println("Age on Mars :" + seconds / MarsSeconds+ " Days");
        System.out.println("Age on Jupiter :" + seconds / JupiterSeconds+ " Days");
        System.out.println("Age on Saturn :" + seconds / SaturnSeconds+ " Days");
        System.out.println("Age on Uranus :" + seconds / UranusSeconds+ " Days");
        System.out.println("Age on Neptune :" + seconds / NeptuneSeconds+ " Days");
    }
}
