/**
 * The class  <b>BirthdayParadox</b> is used to
 * simulated the so-called Birthday paradox, and uses
 * the class <b>Statistics</b> to store the results of
 * the experiments.
 *
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
import java.lang.Object;
import java.util.Scanner;

public class BirthdayParadox2{
    public int range;


   
	/** 
     * Randkom generator 
     */
	private static java.util.Random generator = new java.util.Random();

        public BirthdayParadox2(int range){
            this.range=range;
        }


	/** 
     * Runs the series of experiments, and stores the result into
     * a Statistics object
     * 
     * @param range the size of the set from which random number are drawn
     * @param numberOfRuns the number of experiments to run
	 *
	 * @return a reference to a Statistics instance that holds the result
	 * of the experiment
     */
 	public static Statistics runExperiments(int range, int numberOfRuns){
            int i=0;
            Statistics result =  new Statistics(numberOfRuns);
            while((i<numberOfRuns-1)){
                result.updateStatistics(oneRun(range));
                i++;
            }

        return result;        
	}

 	/** 
     * Runs a single experiment.
     * The parameter range defines the size of the set from which
     * the experiment is drawn
     * 
     * @param range the size of the set from which random number are drawn
     *
	 * @return the number of random draw in the set that the method 
	 * used before drawing the same element for the second time
     */
	
 	private static int oneRun(int range){
            int [] arrayOfNum = new int [range];
            int randomDraw=0;
            int a= generator.nextInt(range);
            int i=0;
            while(arrayOfNum[a]!=a){
                arrayOfNum[a]=a;
                randomDraw++;
                a = generator.nextInt(range);
            }
        return randomDraw;
	}
	

	/** 
     * Main method. The default size of the set is 365, and
     * the experiment is run 50 times. Both numbers can be reset
     * from the command line.
     * This method runs the experiments and prints the
     * resulting Statistics
     * 
     * @param args if not empty, contains the runtime values for
     * the size of the set and the number of runs
     */
	public static void main(String[] args) {
        
        int incr, maxSize, NumOfEx;
        if (args.length==3){
            setSize=Integer.parseInt(args[0]);
            incr=Integer.parseInt(args[0]);
            maxSize=Integer.parseInt(args[1]);
            NumOfEx=Integer.parseInt(args[2]);
        }
        else{
            setSize=100;
            incr=100;
            maxSize=10000;
            experiments=1000;
        }

        StudentInfo.display();
        while (setSize<=maxSize){
            System.out.println(BirthdayParadox2.runExperiments(setSize, experiments));
        }
	}

}
