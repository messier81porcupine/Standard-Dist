import java.lang.reflect.Array;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;

public class Sim {
    public SortedMap runBall(int totalIterations, int totalBounces){ // totalIterations = num of balls to run // bounces should always be odd
        //HashMap<Integer, Integer> bins = new HashMap<Integer, Integer>();
        SortedMap<Integer, Integer> bins = new TreeMap<>();
        for (int i = totalBounces * -1; i <= totalBounces; i ++){
            System.out.println(i);
            if (i % 2 != 0){
                bins.put(i,0);
            }
            
            System.out.println(bins);
        }    
        
        //Random rand = new Random();
        for (int iteration = 0; iteration < totalIterations; iteration ++){ // for each ball
            int dir = 0;
            int pos = 0;
            System.out.println("\nBall #" + iteration);
            

            for (int bounce = 0; bounce < totalBounces; bounce ++){ // for each bounce
                //decide which way ball goes
                dir = 0;
                double num = Math.random();
            
                if (num <= 0.5){
                    dir = -1;
                }
                else if (num >= 0.5) { 
                    dir = 1;
                }
                System.out.println("Bounce #" + bounce);
                System.out.println(pos + " " + dir);
                pos += dir;
                
                System.out.println("Pos " + pos);
            }
            
            
            bins.put(pos, bins.get(pos) + 1); //place ball into its bin (decided by pos) via incrementing that bin


        }
    return bins;
    }   
}
