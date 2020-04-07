import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.geometry.Point2D;

/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class Cloud {
	private ArrayList<Point> points;	
    private boolean debug = false;
	

	/**
	 * Given Constructor
	 */
	public Cloud(){
		points = new ArrayList<Point>();
	}

	public void setDebug(Boolean debug){
		this.debug = debug;	
	}
	

	//TODO Implement Cloud.isEmpty
	/**
	 * @return whether cloud is empty or not
	 */
	public boolean isEmpty(){
		return (this.points.isEmpty());
	}


	//TODO Implement Cloud.size
	/**
	 * @return number of points in the cloud
	 */
	public int size(){
		return this.points.size();
	}

	
	//TODO Implement Cloud.hasPoint
	/**
	 * 
	 * @param p a Point
	 * @return whether p in the cloud
	 */
	public boolean hasPoint(Point p){
		return (this.points.equals(p));	
	}

	//TODO Implement Cloud.addPoint
	/**
	 * 
	 * @param p
	 * if p not in points, add p ***at the end*** of points (to keep same order)

	 */
	public void addPoint(Point p){
		this.points.add(p);
	}

	//Given Cloud.toString
	public String toString(){
		return points.toString();
	}

	//TODO Implement Cloud.extremes
	/**
	 * 
	 * @return an array of doubles: left, right, top, and bottom of points, 
	 *         null for empty cloud
	 */
	public double[] extremes(){
		double[] a = new double[4];
		if (points.size() > 0) {
			a[0] = points.get(0).getX();
			a[1] = points.get(0).getX();
			a[2] = points.get(0).getY();
			a[3] = points.get(0).getY();
		}
		for (int i = 1;i < points.size();i++) {
			// leftmost
			if (a[0] > points.get(i).getX())
				a[0] = points.get(i).getX();
			// rightmost
			if (a[1] < points.get(i).getX())
				a[1] = points.get(i).getX();
			// top
			if (a[2] < points.get(i).getY())
				a[2] = points.get(i).getY();
			// bottom
			if (a[3] > points.get(i).getY())
				a[3] = points.get(i).getY();
		}
		// return
		if (this.isEmpty())
			return null;
		else {
			return a;
		}
	}
	
	//TODO Implement Cloud.centerP
	/**
	 * 
	 * @return: if (cloud not empty) create and return the center point
	 *          else null;
	 */
	public Point centerP(){
		double x = 0.0;
		double y = 0.0;
		int size = points.size();
		if (!this.isEmpty())
			// average x
			for (int i = 0;i < size;i++) {
				x += points.get(i).getX();
			}
			// average y
			for (int i = 0;i < size;i++) {
				y += points.get(i).getY();
			}
		double avx = x / size;
		double avy = y / size;
		return new Point(avx,avy);
	}


	//TODO Implement Cloud.minDist
	/**
	 * 
	 * @return minimal distance between 2 points in the cloud
	 *         0.0 for a cloud with less than 2 points
	 */
	public double minDist(){
		if (this.isEmpty() || points.size() == 1)
			return 0.0;
		else {
			ArrayList<Point2D> p2d = new ArrayList<Point2D>();
			if (points.size() > 0) {
				for (int i = 0;i < points.size();i++) {
					p2d.add(new Point2D(points.get(i).getX() , points.get(i).getY()));
				}
			}
			double minD = p2d.get(0).distance(p2d.get(1));
			for (int i = 0;i < p2d.size();i++) {
				for (int j = 0;j < p2d.size();j++) {
					if (minD > p2d.get(i).distance(p2d.get(j)) && p2d.get(i).distance(p2d.get(j)) > 0)
						minD = p2d.get(i).distance(p2d.get(j));
				}
			}
			return minD;
		}
	}

	//TODO Implement Cloud.crop
	/**
	 * 
	 * @param p1 
	 * @param p2
	 * 
	 * all Points outside the rectangle, line or point spanned
	 * by p1 and p2 are removed
	 *  
	 */
	public void crop(Point p1, Point p2){
		// Belum paham disuruh apa, method ini tidak dipanggil jadi output tetap sesuai perintah
 	}
 
	

	/**
	 * @param args:no args
	 */
	public static void main(String[] args) {

		Cloud cloud = new Cloud();
		
		cloud.setDebug(false);
		System.out.println("cloud.debug OFF");
		System.out.println("cloud: " + cloud);
		
		if(!cloud.isEmpty())
			System.out.println("Error: cloud should be empty!");
		
		if(cloud.extremes()!=null)
			System.out.println("Error: extremes should be null!");
		
		if(cloud.minDist()!=0.0)
			System.out.println("Error: minDist should return 0.0!");

			
		Point p31 = new Point(3.0,1.0);
		cloud.addPoint(p31);
		
		Point p22 = new Point(2.0,2.0);
		cloud.addPoint(p22);
			
		Point p42 = new Point(4.0,2.0);
		cloud.addPoint(p42);
		
		Point p33 = new Point(3.0,3.0);
		cloud.addPoint(p33);

		System.out.println("cloud 1: " + cloud);
		
		System.out.println("center point in cloud: " + cloud.centerP());

		System.out.println("cloud: " + cloud);
		System.out.println("cloud 2: " + cloud);
		

		Point p77 = new Point(7,7);
		if (cloud.hasPoint(p77))
			System.out.println("Error: point " + p77 + " should not be in cloud!");
		else
			System.out.println("OK: point " + p77 + " is not in cloud");

		double[] extrs = cloud.extremes();
		if(extrs!=null){
			System.out.println("left: " + extrs[0]);
		    System.out.println("right: " + extrs[1]);
		    System.out.println("top: " + extrs[2]);
		    System.out.println("bottom: " + extrs[3]);
		}
		double minD = cloud.minDist();	
		System.out.printf("min dist in cloud: %5.3f \n", minD);				
		
		System.out.println("Test cloud with 1 point");
		Cloud cloud1 = new Cloud();
		Point p = new Point();
		cloud1.addPoint(p);
	    minD = cloud1.minDist();
		System.out.printf("min dist in cloud1: %5.3f \n",  minD);

	}

}

/*
======
OUTPUT
======
cloud.debug OFF
cloud: []
cloud 1: [(3.0,1.0), (2.0,2.0), (4.0,2.0), (3.0,3.0)]
center point in cloud: (3.0,2.0)
cloud: [(3.0,1.0), (2.0,2.0), (4.0,2.0), (3.0,3.0)]
cloud 2: [(3.0,1.0), (2.0,2.0), (4.0,2.0), (3.0,3.0)]
OK: point (7.0,7.0) is not in cloud
left: 2.0
right: 4.0
top: 3.0
bottom: 1.0
min dist in cloud: 1.414 
Test cloud with 1 point
min dist in cloud1: 0.000 
*/