package utsystem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileIO {

	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("c:\\jsample\\FileIOTest.txt",true);
			BufferedWriter br = new BufferedWriter(fw);
			PrintWriter oWt = new PrintWriter(br);
			oWt.println("ファイルに書いたデータ");
			oWt.close();
		}
		catch(IOException errlnf){
			System.out.println("入出力エラー" + errlnf);
		}
	}

}
