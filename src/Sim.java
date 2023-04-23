import java.util.SortedMap;
import java.util.TreeMap;


public class Sim {
    public SortedMap runBall(int totalIterations, int totalBounces){ // totalIterations = num of balls to run // bounces should always be odd
        
        SortedMap<Integer, Integer> bins = new TreeMap<>();
        for (int i = totalBounces * -1; i <= totalBounces; i ++){
            //create bins for balls to land in, only odd numbers because the balls will never land in an even bin
            System.out.println(i);
            if (i % 2 != 0){
                bins.put(i,0);
            }
            
            System.out.println(bins);
        }    
        
        
        for (int iteration = 0; iteration < totalIterations; iteration ++){ // for each ball
            int dir = 0; //direction ball will move
            int pos = 0; //current position of ball (changed by dir every bounce) 
            System.out.println("\nBall #" + iteration);
            

            for (int bounce = 0; bounce < totalBounces; bounce ++){ // for each bounce
                //decide which way ball goes
                dir = 0; //reset direction on each bounce
                double num = Math.random();
                // if random is > go right, if < go left
                if (num <= 0.5){
                    dir = -1;
                }
                else if (num >= 0.5) { 
                    dir = 1;
                }
                //Debug Output
                System.out.println("Bounce #" + bounce);
                System.out.println(pos + " " + dir);
                //change pos by dir
                pos += dir;
                
                System.out.println("Pos " + pos);
            }
            
            
            bins.put(pos, bins.get(pos) + 1); //place ball into its bin (decided by pos) via incrementing that bin


        }
    return bins;
    }   
}
