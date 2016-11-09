package utsystem;

public class ArrayDeviation extends ArrayProcessor {

	private int[] devArray;		//
	private double[] dev;		//偏差
	private double varia;		//分散
	private double stdDev;		//標準偏差
	private double[] devVal;	//偏差値

	public ArrayDeviation(int[] devArray){
		super(devArray);
		this.devArray = devArray;
		calcDev();
	}
	public void calcDev(){
		dev = new double[getLength()];
		for(int i = 0; i < devArray.length; i++){
			dev[i] = devArray[i] - super.getAverage();
			varia += dev[i] * dev[i];
		}

	}
	public double[] getDev(){
		return dev;
	}
	public double getVaria(){
		return varia;
	}
	public double getStdDev(){
		return stdDev;
	}
	public double[] getDevVal(){
		return devVal;
	}
}
