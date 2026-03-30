public class UnemploymentGreater6mo extends Unemployment 
{
    private int jobs;
    public UnemploymentGreater6mo()
    {
        super();
        this.jobs = 0;
    }
    public UnemploymentGreater6mo(String name, double benefit, int jobs, int reels) 
    {
        this.claimantName = name;
        this.weeklyBenefit = benefit;
        this.jobs = jobs;
        this.reelsWatched = reels;
    }

    @Override
    public void displayStatus() 
    {
        System.out.println("Status: >6mo Audit required for " + jobs + " applications.");
    }

    @Override
    public String toString() 
    {
        return "Claimant: " + claimantName + " Benefit: " + weeklyBenefit + 
               " Jobs: " + jobs + " Reels: " + reelsWatched;
    }
}
