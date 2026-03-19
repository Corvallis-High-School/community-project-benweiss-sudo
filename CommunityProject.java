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
    public void print()
    {
        System.out.println("Percent Unemployed: " + unempAmnt + " Jobs: " + jobs + " Reels Watched: " + reelsWatched);
    }
    // 4. Create accessor (get) methods for each of the instance variables.
    public double getUnempAmnt() 
    {
        return unempAmnt;
    }

    public int getJobs() 
    {
        return jobs;
    }

    public int getReelsWatched() 
    {
        return reelsWatched;
    }
    
    // 5. Create mutator (set) methods for each of the instance variables.
    public void setUnempAmnt(double newUnempAmnt) 
    {
        unempAmnt = newUnempAmnt;
    }

    public void setJobs(int newJobs) {
        jobs = newJobs;
    }

    public void setReelsWatched(int newReelsWatched) {
        reelsWatched = newReelsWatched;
    }
    // 6. Create a toString() method that returns all the information in the instance variables.
    public String toString() 
    {
        return "Percent Unemployed" + unempAmnt + " Jobs: " + jobs + " Reels Watched: " + reelsWatched;
            
    }
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).
    
    // 8. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls all of the methods that you created above to test them.
    public static void main(String[] args)
    {
       // Construct 2 objects of your class using the constructor with different values
        unemployment town1 = new unemployment(0.23, 3949, 2934892);
        unemployment town2 = new unemployment(0.04, 432, 34895);
        

       // call all of the objects methods to test them
        town1.getUnempAmnt();
        town1.getReelsWatched();
        town1.getJobs();
        town1.print();
        town1.setUnempAmnt(.39);
        town1.setReelsWatched(4309032);
        town1.setJobs(5605);
        town1.toString();
        town1.print();
        town1.print(1);

        town2.getUnempAmnt();
        town2.getReelsWatched();
        town2.getJobs();
        town2.print();
        town2.setUnempAmnt(.39);
        town2.setReelsWatched(4309032);
        town2.setJobs(5605);
        town2.toString();
        town2.print(0);
       

    }
}

