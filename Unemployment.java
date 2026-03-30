public class Unemployment {
    protected String claimantName;
    protected double weeklyBenefit;
    protected int reelsWatched;
    public Unemployment() 
    {
        this.claimantName = " ";
        this.weeklyBenefit = 0.0;
        this.reelsWatched = 0;
    }
    public void displayStatus() 
    {
        System.out.println("Unemployment Status");
    }
    public void print(int format) 
    {
        if (format == 1) {
            System.out.println(claimantName + ", " + weeklyBenefit);
        } else {
            System.out.println("Claimant: " + claimantName + ", Benefit: " + weeklyBenefit);
        }
    }
}


