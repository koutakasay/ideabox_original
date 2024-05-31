package poketype;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Battle {

	private final ArrayList<String> typeIndex = new ArrayList<>();

    public static void main(String[] args) {
        Battle start = new Battle();
        //タイプを定義
        start.initializeTypeIndex();
        //battleメソッド起動
        start.battle();
    }

    private void initializeTypeIndex() {
        typeIndex.add("fire");
        typeIndex.add("water");
        typeIndex.add("grass");
        typeIndex.add("flying");
        typeIndex.add("electric");
        typeIndex.add("ground");
        typeIndex.add("ice");
        typeIndex.add("fighting");
        typeIndex.add("psychic");
        typeIndex.add("ghost");
        typeIndex.add("dark");
        typeIndex.add("bug");
        typeIndex.add("rock");
        typeIndex.add("steel");
        typeIndex.add("poison");
        typeIndex.add("dragon");
        typeIndex.add("fairy");
        typeIndex.add("normal");
    }

    //攻撃側のタイプ
    private String selectType(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String selectedType = "";
        boolean validInput = false;
        
        while(!validInput) {
            selectedType = scanner.nextLine();
            if(typeIndex.contains(selectedType)) {
                validInput = true;
            } else {
                System.out.println("エラーです、もう一度入力してください");
            }
        }
        return selectedType;
    }
    
    //防御側のタイプ
    private String generateRandomType() {
        Random random = new Random();
        int randomNumber = random.nextInt(typeIndex.size());
        return typeIndex.get(randomNumber);
    }

    //攻撃・防御両者のタイプを受け取り、calculateResultメソッドの結果を出力
    public void battle() {
        Scanner scanner = new Scanner(System.in);

        String attackType = selectType(scanner, "攻撃側のタイプを入力してください");
        String defenceType = generateRandomType();
        
        System.out.println("攻撃側は" + attackType + "タイプ, 防御側は" + defenceType + "タイプ");

        String result = calculateResult(attackType, defenceType);
        System.out.println(result);

        scanner.close();
    }

    private String calculateResult(String attackType, String defenceType) {
        if ((attackType.equals("fire") && (defenceType.equals("grass") || defenceType.equals("ice") || defenceType.equals("bug") || defenceType.equals("steel")))
                || (attackType.equals("water") && (defenceType.equals("fire") || defenceType.equals("ground") || defenceType.equals("rock")))
                || (attackType.equals("grass") && (defenceType.equals("water") || defenceType.equals("ground") || defenceType.equals("rock")))
                || (attackType.equals("flying") && (defenceType.equals("grass") || defenceType.equals("fighting") || defenceType.equals("bug")))
                || (attackType.equals("electric") && (defenceType.equals("water") || defenceType.equals("flying")))
                || (attackType.equals("ground") && (defenceType.equals("fire") || defenceType.equals("electric") || defenceType.equals("rock") || defenceType.equals("poison") || defenceType.equals("steel")))
                || (attackType.equals("ice") && (defenceType.equals("grass") || defenceType.equals("ground") || defenceType.equals("flying") || defenceType.equals("dragon")))
                || (attackType.equals("fighting") && (defenceType.equals("normal") || defenceType.equals("ice") || defenceType.equals("rock") || defenceType.equals("dark") || defenceType.equals("steel")))
                || (attackType.equals("psychic") && (defenceType.equals("fighting") || defenceType.equals("poison")))
                || (attackType.equals("ghost") && (defenceType.equals("psychic") || defenceType.equals("ghost")))
                || (attackType.equals("dark") && (defenceType.equals("psychic") || defenceType.equals("ghost")))
                || (attackType.equals("bug") && (defenceType.equals("psychic") || defenceType.equals("grass") || defenceType.equals("dark")))
                || (attackType.equals("rock") && (defenceType.equals("fire") || defenceType.equals("ice") || defenceType.equals("flying") || defenceType.equals("bug")))
                || (attackType.equals("steel") && (defenceType.equals("ice") || defenceType.equals("fairy") || defenceType.equals("rock")))
                || (attackType.equals("poison") && (defenceType.equals("grass") || defenceType.equals("fairy")))
                || (attackType.equals("dragon") && (defenceType.equals("dragon")))
                || (attackType.equals("fairy") && (defenceType.equals("fighting") || defenceType.equals("dragon") || defenceType.equals("dark")))
                ) {
            return "効果は抜群だ！";
        } else if ((attackType.equals("fire") && (defenceType.equals("fire") || defenceType.equals("water") || defenceType.equals("rock") || defenceType.equals("dragon")))
                || (attackType.equals("water") && (defenceType.equals("water") || defenceType.equals("grass") || defenceType.equals("dragon")))
                || (attackType.equals("grass") && (defenceType.equals("fire") || defenceType.equals("grass") || defenceType.equals("poison") || defenceType.equals("flying") || defenceType.equals("bug") || defenceType.equals("dragon") || defenceType.equals("steel")))
                || (attackType.equals("electric") && (defenceType.equals("electric") || defenceType.equals("grass") || defenceType.equals("dragon")))
                || (attackType.equals("ground") && (defenceType.equals("grass") || defenceType.equals("bug")))
                || (attackType.equals("ice") && (defenceType.equals("fire") || defenceType.equals("water") || defenceType.equals("ice") || defenceType.equals("steel")))
                || (attackType.equals("fighting") && (defenceType.equals("poison") || defenceType.equals("flying") || defenceType.equals("psychic") || defenceType.equals("bug") || defenceType.equals("fairy")))
                || (attackType.equals("psychic") && (defenceType.equals("psychic") || defenceType.equals("steel")))
                || (attackType.equals("ghost") && (defenceType.equals("dark")))
                || (attackType.equals("dark") && (defenceType.equals("fighting") || defenceType.equals("dark") || defenceType.equals("fairy")))
                || (attackType.equals("bug") && (defenceType.equals("fire") || defenceType.equals("fighting") || defenceType.equals("poison") || defenceType.equals("flying") || defenceType.equals("ghost") || defenceType.equals("steel") || defenceType.equals("fairy")))
                || (attackType.equals("rock") && (defenceType.equals("fighting") || defenceType.equals("ground") || defenceType.equals("steel")))
                || (attackType.equals("steel") && (defenceType.equals("fire") || defenceType.equals("water") || defenceType.equals("electric") || defenceType.equals("steel")))
                || (attackType.equals("poison") && (defenceType.equals("poison") || defenceType.equals("ground") || defenceType.equals("rock") || defenceType.equals("ghost")))
                || (attackType.equals("dragon") && (defenceType.equals("steel")))
                || (attackType.equals("fairy") && (defenceType.equals("fire") || defenceType.equals("poison") || defenceType.equals("steel")))
                || (attackType.equals("normal") && (defenceType.equals("rock") || defenceType.equals("steel")))
                ) {
            return "効果はいまひとつだ";
        } else if ((attackType.equals("electric") && defenceType.equals("ground"))
        		|| (attackType.equals("fighting") && defenceType.equals("ghost"))
        		|| (attackType.equals("poison") && defenceType.equals("steel"))
        		|| (attackType.equals("ground") && defenceType.equals("flying"))
        		|| (attackType.equals("psychic") && defenceType.equals("dark"))
        		|| (attackType.equals("ghost") && defenceType.equals("normal"))
        		|| (attackType.equals("dragon") && defenceType.equals("fairy"))
        		|| (attackType.equals("normal") && defenceType.equals("ghost"))
                ) {
            return "効果がないみたいだ..";
        } else {
            return "普通です";
        }
    }
}
