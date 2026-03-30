import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Unemployment> claimantList = new ArrayList<>();
        claimantList.add(new UnemploymentGreater6mo("Saffin", 450.0, 15, 120));
        claimantList.add(new UnemploymentGreater18mo("Snoopy", 380.0, 500, "Dogfighting"));
        claimantList.add(new UnemploymentGreater6mo("Charlie Brown", 500.0, 5, 30));
        System.out.println("Community Claims");
        for (Unemployment u : claimantList) {
            System.out.println(u.toString()); 
            u.displayStatus();               
            if (u instanceof UnemploymentGreater18mo) {
                ((UnemploymentGreater18mo) u).applyForExtension();
            }
            System.out.println("---------------------------------------");
        }
    }
}