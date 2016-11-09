package utsystem;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("横の長さを入力してください：");
		int width =  stdln.nextInt();
		System.out.print("縦の長さを入力してください：");
		int height = stdln.nextInt();

		Rectangle r  = new Rectangle(width, height);
		System.out.println("横 " + r.getWidth() + " 縦 " + r.getHeight() + " の長方形の外周は " + r.getCircum() + "、面積は " + r.getArea() + " です。");

	}

}
