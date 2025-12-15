package Lab_02;



public class Rectangle {
		
		int length;
		int width;
		
	    // Constructor
		 Rectangle(int length ,int width ) {
			this.length=length;
			this.width=width;
		}
		
		//Method to calculate the area
		
		int getArea() {
			return length * width;
		}

		
	public static void main(String[] args) {
        // Instantiate two rectangles with random values
		
		Rectangle r1 = new Rectangle(5, 8);
		Rectangle r2 = new Rectangle(6, 4);
		
		//Calculate Area call
		
		int area1 = r1.getArea();
		int area2 = r2.getArea();

		//Comparing
		
		if(area1> area2) {
			System.out.println("Rectangle1 > Rectangle2");
		}else if(area1< area2) {
            System.out.println("Rectangle1 < Rectangle2");

		}else {
            System.out.println("They are equa");

		}
		
	

	}

}
