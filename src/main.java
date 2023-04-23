import java.io.*;

public class main {
    public static void main(String[] args) 
    throws IOException
    {
        Sim sim = new Sim();
        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Enter the Number of Balls to Run: ");
        String numBalls = bfn.readLine();
        int totalIterations = Integer.parseInt(numBalls);

        System.out.println("Enter the Number of Bounces per Ball: ");
        String numBounces = bfn.readLine();
        int totalBounces = Integer.parseInt(numBounces);

        System.out.println(sim.runBall(totalIterations, totalBounces));
        
    }
    
}
