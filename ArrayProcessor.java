package utsystem;

public class ArrayProcessor {
	private int[] myArray;
	private int max;
	private int min;
	private int sum;
	private double average;

	public ArrayProcessor(int[] array){
		myArray = array;
		max = min = myArray[0];
		for(int i = 0; i < myArray.length; i++){
			sum += myArray[i];
			if(max < myArray[i])
				max = myArray[i];
			if(min > myArray[i])
				min = myArray[i];
		}
	}
	public int getLength(){
		return myArray.length;
	}
	public int getMax(){
		return max;
	}
	public int getMin(){
		return min;
	}
	public int getSum(){
		return sum;
	}
	public double getAverage(){
		return (double)sum/getLength();
	}
}
