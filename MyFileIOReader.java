package utsystem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileIOReader {

	public static void main(String[] args) {
		String line = null;
		try{
			FileReader fr = new FileReader("c:\\jsample\\FileIOTest.txt");
			BufferedReader iBuf = new BufferedReader(fr);
			while((line = iBuf.readLine()) != null){
				System.out.println(line);
			}
			iBuf.close();
		}
		catch(IOException errlnf){
			System.out.println("入出力エラー" + errlnf);
		}
	}

}
