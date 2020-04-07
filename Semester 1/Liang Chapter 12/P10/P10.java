import java.util.*;
import java.io.*;

public class P10 implements Interface {

	// Read temperatures into an array
    public Temperature[] readTemperatures(String filename) {
    	Temperature[] temp = null;
    	try {
    		File inFile = new File(filename);
    		Scanner scan = new Scanner(inFile);
    		while (scan.hasNextInt()) {
    			temp = new Temperature[scan.nextInt() + 1];
    		}
    		int i = 0;
    		while (scan.hasNextLine()) {
    			Scanner linescan = new Scanner(scan.nextLine());
    			temp[i] = new Temperature(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble());
    			i++;
    		}
    	} catch (IOException e) {
    		System.out.println("Unable to find the file.");
    		System.exit(-1);
    	}
    	return temp;
    }
    
    // Find minimum temperature over a period
    public double findMinimum(Date start, Date end, Temperature[] data) {
    	double min = data[0].temperature;
    	for (int i = 0;i < data.length;i++) {
    		if (data[i].inInterval(start, end)) {
    			if (data[i].temperature < min)
    				min = data[i].temperature;
    		}
    	}
    	return min;
    }
    
    // Find maximum temperature over a period
    public double findMaximum(Date start, Date end, Temperature[] data) {
    	double max = data[0].temperature;
    	for (int i = 0;i < data.length;i++) {
    		if (data[i].inInterval(start, end)) {
    			if (data[i].temperature > max)
    				max = data[i].temperature;
    		}
    	}
    	return max;
    }

    // Find average temperature over a period
    public double findAverage(Date start, Date end, Temperature[] data) {
    	double sum = 0;
    	int total = 0;
    	for (int i = 0;i < data.length;i++) {
    		if (data[i].inInterval(start, end)) {
    				sum += data[i].temperature;
    				total++;
    		}
    	}
    	return sum / total;
    }
    
    // Find highest windspeed over a period
    public double findHighest(Date start, Date end, Temperature[] data) {
    	double high = data[0].windspeed;
    	for (int i = 0;i < data.length;i++) {
    		if (data[i].inInterval(start, end)) {
    			if (data[i].windspeed > high)
    				high = data[i].windspeed;
    		}
    	}
    	return high;
    }

    public static void main(String[] args) {
    	// Instantiate student code
	    P10 p10 = new P10();
	    
	    // Test readTemperatures
	    Temperature[] data = p10.readTemperatures(args[0]);
	    
	    // Test findMinimum
	    Date start = Temperature.createDate("04-Jul-2008", "06:00");
	    Date end = Temperature.createDate("17-Aug-2010", "23:00");
	    System.out.println("Verifying findMinimum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Minimum = %.1f degrees\n \n", p10.findMinimum(start, end, data));

	    // Test findMaximum 
	    start = Temperature.createDate("19-Sep-2011", "07:00");
	    end = Temperature.createDate("23-Mar-2015", "13:00");
	    System.out.println("Verifying findMaximum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Maximum = %.1f degrees\n \n", p10.findMaximum(start, end, data));

	    // Test findAverage
	    start = Temperature.createDate("09-Apr-2006", "19:00");
	    end = Temperature.createDate("31-Oct-2013", "10:00");
	    System.out.println("Verifying findAverage method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Average = %.1f degrees\n \n", p10.findAverage(start, end, data));

	    // Test findHighest
	    start = Temperature.createDate("01-Jan-2015", "00:00");
	    end = Temperature.createDate("31-Dec-2015", "23:00");
	    System.out.println("Verifying findHighest method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Highest windspeed = %.1f\n \n", p10.findHighest(start, end, data));
    }
}