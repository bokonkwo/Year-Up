
public class CalculateArea {

	public static void main(String[] args) 
	{
		System.out.println("I am going to calculate the area of a circle");
		double areaInMainMethod = CalculateCircleArea(10);
		System.out.println("Area of the Circle " + areaInMainMethod);
		
		System.out.println("I am going to calculate the area of a rectangle");
		double rectArea = AreaRect(5, 7);
		System.out.println("Area of the Rectangle " + rectArea);
	}
	
	
	public static double CalculateCircleArea(int radius)
	{
		//This method calculates the area of a circle
		//Input: integer radius value
		//Output: double area
		
		double area = 3.14 * radius * radius;
		return area;
		}
		
	public static double AreaRect(int width, int length){
	
		double area= length * width;
		return area;
	}
}