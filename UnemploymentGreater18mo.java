public class UnemploymentGreater18mo extends Unemployment 
{
    private String retrainingProgram;
    public UnemploymentGreater18mo() 
    {
        super();
        this.retrainingProgram = "General Education";
    }
    public UnemploymentGreater18mo(String name, double benefit, int reels, String program) 
    {
        this.claimantName = name;
        this.weeklyBenefit = benefit;
        this.reelsWatched = reels;
        this.retrainingProgram = program;
    }
    public void applyForExtension() 
    {
        System.out.println("Applying for extension:");
    }
    @Override
    public void displayStatus() 
    {
        System.out.println("Long term unemployment, Program:" + retrainingProgram);
    }
    @Override
    public String toString()
    {
        return "Claimant: " + claimantName + 
            " Benefit: " + weeklyBenefit + 
            " Program: " + retrainingProgram + 
            " Reels Watched: " + reelsWatched;
    }
}