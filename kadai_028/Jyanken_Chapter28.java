package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    private Scanner sc = new Scanner(System.in);
    private Random rand = new Random();

    // じゃんけん手の対応表
    private Map<String, String> handMap = new HashMap<>();
    {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice;
        while (true) {
            choice = sc.nextLine().trim().toLowerCase();
            if (handMap.containsKey(choice)) {
                break;
            }
            System.out.println("r, s, pのいずれかを入力してください");
        }
        return choice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(rand.nextDouble() * 3);
        return hands[index];
    }

    // じゃんけんを行う
    public void playGame() {
        String myHand = getMyChoice();
        String enemyHand = getRandom();

        System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(enemyHand));

        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}

