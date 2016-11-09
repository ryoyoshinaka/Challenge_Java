package utsystem2;

public class Guest extends User {
	Guest(){
		super("ゲスト");
	}
	boolean testAndMark(Article article){
		return article.isFree();	//穴埋めa
	}

}
