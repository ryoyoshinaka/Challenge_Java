package utsystem2;

import java.util.TimeZone;

public class Member extends User{
	private static final long MILLIS_PER_DAY = 24*60*60*1000L;
	private Article browseArticle;
	private long browseDate = Long.MIN_VALUE;
	Member(String name) {
		super(name);	//穴埋めb
	}
	boolean testAndMark(Article article){
		if(article.isFree()){
			return true;
		}
		long today = today();
		if(browseDate < today){	//穴埋めc
			return browseArticle == article;
		}
		browseArticle = article;
		browseDate = today;
		return true;
	}
	private long today(){
		long time = System.currentTimeMillis();
		TimeZone tz = TimeZone.getDefault();
		time += tz.getOffset(time);
		return time / MILLIS_PER_DAY;
	}

}
