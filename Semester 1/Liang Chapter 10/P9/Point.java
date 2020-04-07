
public class Point {

/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

	private double x;
	private double y;

	public static final double EPSILON = 1e-5;
    public static boolean debug = false;
    
	//TODO Implement Point.Point(double x, double y)
	/** instantiate a point
	 * "this.x" refers to the instance variable of the object
     * x refers to the parameter
     * same for this.y and y
     */
	public Point(double x, double y){
		this.x = x;
		this.y = y;

		// System.out.println("Point(x,y) not implemented yet");
	}

	//TODO Implement Point.Point()
	/**
	 * Point() creates the origin by appropriately calling
	 * the general Point constructor
	 */
	public Point(){
		// this.Point(0.0,0.0);
		this.x = 0.0;
		this.y = 0.0;

		//System.out.println("Point() not implemented yet");
	}
	
	//TODO Implement Point.getX
	/**
	 * @return x
	 */
	public double getX(){
		// System.out.println("getX not implemented yet");
		return x;
	}

	//TODO Implement Point.getY
	/**
	 * @return y
	 */
	public double getY(){
		// System.out.println("getY not implemented yet");
		return y;

	}


	// Given Point.toString
	/**
	 *  convert to String
	 */
	public String toString(){
		return "("+x+","+y+")";
	}


	//TODO Implement Point.equals
	/**
	 * 
	 * @param p other point
	 * @return test for equality using epsilon, because we 
	 *         are dealing with doubles,so roundoff can occur
	 */
	public boolean equals (Point p){
		// System.out.println("equals not implemented yet");

		return (this.x - p.x < EPSILON);
	}

	
	// Given equals(Object o)
  	/**
  	 * We need this equals method for ArrayList<Point>, because
  	 * the generic ArrayList is really an ArrayList of Object.
  	 * In the case of equals, the signature is 
  	 *   public boolean equals(Object o)
  	 * and the method below overrides the Object equals method
  	 * and the calls the class's equals(Point) method
  	 *    
  	 * @see java.lang.Object#equals(java.lang.Object)
  	 */
  	public boolean equals(Object obj){
		if (obj instanceof Point){
			Point p = (Point)obj;
		    return equals(p);
		}
	    return false;
	}
	

	//TODO Implement Point.euclidDist
	/**
	 * 
	 * @param p 
	 * @return Euclidean distance of this point to point p
	 */
	public double euclidDist(Point p){
		// System.out.println("euclidDist not implemented yet");
		return Math.sqrt((Math.pow((this.x - p.x), 2)) + (Math.pow((this.y - p.y), 2)));
    }

	/**
	 * @param args: no args
	 */
	public static void main(String[] args) {

		// test all methods

		if(debug)
			System.out.println("debug ON");
		else
			System.out.println("debug OFF");
		
		System.out.println("EPSILON: " + Point.EPSILON);
		
		Point origin = new Point();
		Point p1 = new Point(0.0,4.0);
		Point p2 = new Point(3.0000001,3.9999999);
		Point p3 = new Point(3.0,4.0);
		
		Point p4 = new Point(0.0,5.0);
		Point p5 = new Point(12.0,0.0);		

		System.out.println("origin: " + origin);
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		System.out.println("p5: " + p5);
		

		if(p2.equals(p3)) 
			System.out.println(p2 + " equals " + p3);
		else
			System.out.println(p2 + " does not equal " + p3);


		System.out.println("Euclidean distance between " + origin +
				" and " + p1 +": " + origin.euclidDist(p1));

		System.out.println("Euclidean distance between " +  p1 +
				" and " + p3 +": " + p1.euclidDist(p3));                


		System.out.println("Euclidean distance between " +  p3 +
				" and " + origin +": " + p3.euclidDist(origin));
		

		System.out.println("Euclidean distance between " +  p4 +
				" and " + p5 +": " + p4.euclidDist(p5));
		
	}
}

/*
======
OUTPUT
======
debug OFF
EPSILON: 1.0E-5
origin: (0.0,0.0)
p1: (0.0,4.0)
p2: (3.0000001,3.9999999)
p3: (3.0,4.0)
p4: (0.0,5.0)
p5: (12.0,0.0)
(3.0000001,3.9999999) equals (3.0,4.0)
Euclidean distance between (0.0,0.0) and (0.0,4.0): 4.0
Euclidean distance between (0.0,4.0) and (3.0,4.0): 3.0
Euclidean distance between (3.0,4.0) and (0.0,0.0): 5.0
Euclidean distance between (0.0,5.0) and (12.0,0.0): 13.0
*/