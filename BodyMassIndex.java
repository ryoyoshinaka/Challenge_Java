package utsystem;

public class BodyMassIndex {
	private String name;
	private int height;
	private int weight;
	private double bmi;
	private String message;

	//コンストラクタ
	public BodyMassIndex(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	//getter と setter
	public String getName(){

		return this.name;

	}
	public int getHeight(){

		return this.height;

	}
	public int getWeight(){

		return this.weight;

	}

	//BMIの計算、返却
	public double getBmi(){

		this.bmi = this.weight / Math.pow(height / 100.0, 2);
		return this.bmi;

	}

}
