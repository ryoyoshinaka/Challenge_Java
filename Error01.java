package utsystem;

import java.io.FileWriter;
import java.io.IOException;

public class Error01 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = null;

		try{
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(IOException e){
			System.out.println("エラー");

		}finally{
			fw.close();
		}
	}

}
