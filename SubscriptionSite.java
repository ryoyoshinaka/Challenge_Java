package utsystem2;

public class SubscriptionSite {

	public static void main(String[] args) {
		User[] readers = {new Guest(), new Member("登録会員A"), new PaidMember("有料会員B")};
		Article.create("0001", "PC入門", "PC初心者", true);
		Article.create("0002", "スマフォ特集", "最新のスマフォ", false);
		Article.create("0003", "アプリガイド", "使えるアプリ", true);
		for(User reader : readers){	//穴埋めe
			for(String id : Article.getIds()){				//穴埋めf
				Article article = Article.getArticle(id);
				String body;
				if(reader.testAndMark(article)){
					body = article.getBody();
				}
				else{
					body = "<閲覧不可>";
				}
				System.out.printf("%s:記事「%s」%s%n", reader.getName(), article.getHeadline(),body);
			}
		}
	}
}
