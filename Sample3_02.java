package utsystem2;

import java.util.ArrayList;

public class Sample3_02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++){
			String text = list.get(i);
			System.out.println(text);
		}
		if(list.isEmpty()){
			System.out.println("パラメーターが未指定です");
		}else if(list.contains("OK")){
			System.out.println("OKが入力されました");
		}else{
			System.out.println("OKが入力されていません");
		}
	}

}
