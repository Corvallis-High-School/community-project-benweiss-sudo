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
    public class UnemploymentGreater6mo extends Unemployment {
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
        System.out.println("Status: Long-term (>6mo). Audit required for " + jobs + " applications.");
    }

    @Override
    public String toString() 
    {
        return "Claimant: " + claimantName + " Benefit: " + weeklyBenefit + 
               " Jobs: " + jobs + " Reels: " + reelsWatched;
    }
}
   public class UnemploymentGreater18mo extends Unemployment {
    private String retrainingProgram;
    public UnemploymentGreater18mo() 
    {
        super();
        this.retrainingProgram = "General Education";
    }
    public UnemploymentGreater18mo(String name, double benefit, int reels, String program) {
        this.claimantName = name;
        this.weeklyBenefit = benefit;
        this.reelsWatched = reels;
        this.retrainingProgram = program;
    }
    public void applyForExtension() {
        System.out.println("Applying for extension:");
    }
    @Override
    public void displayStatus() {
        System.out.println("Long term unemployment, Program:" + retrainingProgram);
    }
    @Override
    public String toString() {
        return "Claimant: " + claimantName + 
               " Benefit: " + weeklyBenefit + 
               " Program: " + retrainingProgram + 
               " Reels Watched: " + reelsWatched;
    }
}
}
