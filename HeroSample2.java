package utsystem;

public class HeroSample2 {
	public static void main(String[] args){

		Hero2 suzuki = new Hero2("鈴木次郎", 180, 75, 24);
		Hero2 tanaka = new Hero2("田中大輔", 170, 68, 46);

		suzuki.gainWeight(100);
		tanaka.reduceWeight(10);

		System.out.println("氏名：" + suzuki.getName() + "  身長：" + suzuki.getHeight() + "cm  " + suzuki.getWeight() + "kg  " + suzuki.getAge() + "才");
		System.out.println("氏名：" + tanaka.getName() + "  身長：" + tanaka.getHeight() + "cm  " + tanaka.getWeight() + "kg  " + tanaka.getAge() + "才");
	}

}
