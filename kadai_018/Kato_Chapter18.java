package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×です";

    // 共通の紹介メソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address);
    }

    // 各人の個別紹介（抽象：サブクラスで実装）
    public abstract void eachIntroduce();

    // 紹介の実行（順番通り）
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}

