package utsystem;

public class HeroSample {

	public static void main(String[] args) {

		Hero suzuki = new Hero();
		Hero tanaka = new Hero();

		suzuki.name = "鈴木次郎";
		suzuki.height = 180;
		suzuki.weight = 75;
		suzuki.age = 24;

		tanaka.name = "田中大輔";
		tanaka.height = 170;
		tanaka.weight = 68;
		tanaka.age = 46;

		System.out.println("氏名：" + suzuki.name + "  身長：" + suzuki.height + "cm  " + suzuki.weight + "kg  " + suzuki.age + "才");

	}

}
