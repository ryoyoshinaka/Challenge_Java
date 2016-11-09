package utsystem;

public class Hero2 {

	String name;
	int height;
	int weight;
	int age;

	public Hero2(String name, int height, int weight, int age){

		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;

	}

	public void gainWeight(int weight){

		this.weight += weight;

	}

	public void reduceWeight(int weight){

		this.weight -= weight;

	}
	public String getName(){

		return this.name;

	}
	public int getHeight(){

		return this.height;

	}
	public int getWeight(){

		return this.weight;

	}
	public int getAge(){

		return this.age;

	}

}
