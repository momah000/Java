/**
 * The class  <b>Statistics</b> accumulates the results of
 * the experiments. It know ahead of time how many experiments
 * will be run, and provides at the end the min, the max, the
 * average and the standard deviation for the data.
 *
 * <b> this class should not use classes such as Array, 
 * Lists etc. </b> to store the data, only primitive types 
 * and java arrays.
 *
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
import java.lang.Math;
public class Statistics {
public int numberOfRuns;
public int[] anArray; 
public int i;
	/** 
     * Constructor.
     * 
     * @param numberOfRuns the number of experiments that will be run
     */
 	public  Statistics2(int numberOfRuns){
            this.numberOfRuns=numberOfRuns;
            this.anArray=new int[numberOfRuns];
            i=0;
	}
     
	/** 
     * Updates statistics after one experiment.
     * This method cannot be called more times than the 
     * parameter that was passed in the constructor. If
     * it is, an error message should be printed and
     * no change should occur.
     *   @param value the result of the new experiment
     */
	public void updateStatistics(int value){
            anArray[i]=value;
            i++;
            average();
            standardDeviation();
            
      
        }
            
            
	
	

	/** 
     *   @return the current average of the values passed
     * to the method updateStatistic
     */
	public double average(){
            double sum=0;
            for(int j=0; j<numberOfRuns; j++){
                sum += anArray[j];
            }
            return sum/numberOfRuns;
        }
            
	/** 
     *   @return the current standard deviation of the values passed
     * to the method updateStatistic
     */
	public double standardDeviation(){
           
            double[] answer= new double[anArray.length];
            
            double b = average();
            double c=0;
            double sd=0;
            double sum=0;
            for (int i=0; i<numberOfRuns; i++){
                c=(double)((anArray[i]-b)*(anArray[i]-b));
                answer[i]=c;
                sum += answer[i];
            }
            sum=sum/numberOfRuns;
            sd=Math.sqrt(sum);
        
            return sd;

	}

	/** 
     *  @return Returns the complete statistics information:
     * current minimum, current maximum, current average and
     * current standard deviation. For the last two, only two 
     * digits decimals are shown
     */
	public String toString(){
            System.out.println("We have run "+numberOfRuns+" experiments."); 
            int max=anArray[0];
            int min=anArray[0];
            for (int i=1; i<numberOfRuns-1; i++){
                if(anArray[i]>max){
                    max=anArray[i];
                }
                if(anArray[i]<min){
                    min=anArray[i];
                }
                }
            
   return("the minimum was "+min+"\nthe maximum was: "+max+"\nthe mean was: "+average()+"\nthe standard deviation was: " + standardDeviation());                          
	}

}