package utsystem2;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

	public static void main(String[] args) {
		String inData;
		try{
			InputStreamReader srObj = new InputStreamReader(System.in);
			BufferedReader bObj = new BufferedReader(srObj);
			inData = bObj.readLine();
			System.out.println(inData);
		}
		catch(IOException errlnf){
			Syatem.out.println("入出力エラー" + errlnf);
		}
	}

}
