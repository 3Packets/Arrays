import java.util.*;
import static java.lang.Double.valueOf;

public class ToPower {

	public static double[] toPower(int size, int power) {
		double [] returnValue = new double[size];
		
		for(int index = 0; index < size; ++index) {
			returnValue[index] = Math.pow(index,  power);
		}
		return returnValue;
	}
	

	public static void main(String[] args) {
        //sum of numbers
        double[] values = toPower(6, 3);
        
        for (double value: values) {
            System.out.println(value);
        }
	}
        
}
        