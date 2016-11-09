package utsystem;

public class Rectangle {
	int width;
	int height;

	Rectangle(int width, int height){
		this.width = width;
		this.height = height;

	}

	int getWidth(){
		return width;

	}
	int getHeight(){
		return height;
	}
	int getCircum(){
		int curcum = 2 * (width + height);
		return curcum;
	}
	int getArea(){
		int area = width * height;
		return area;
	}

}
