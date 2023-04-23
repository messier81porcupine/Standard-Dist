import java.io.*;

public class main {
    public static void main(String[] args) 
    throws IOException
    {
        Sim sim = new Sim();
        //for reading lines
        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));
        
        //Get num of balls from user (also decides how many bins there will be, bounces * 2 = num of bins)
        System.out.println("Enter the Number of Balls to Run: ");
        String numBalls = bfn.readLine();
        int totalIterations = Integer.parseInt(numBalls);

        //Get num of rows for the balls to bounce on from user
        System.out.println("Enter the Number of Bounces per Ball: ");
        String numBounces = bfn.readLine();
        int totalBounces = Integer.parseInt(numBounces);

        System.out.println(sim.runBall(totalIterations, totalBounces));
        
    }
    
}
