/**
 * RomnNum は、1以上20以下のアラビア数字を入力すると、
 * ローマ数字に変換して表示するプログラムである。
 */

package pg_ex01_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomanNum {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);
		try {
			System.out.println("アラビア数字を入力して下さい。ただし、1以上20以下です。");
			String line = reader.readLine();
			int arabic_num = Integer.parseInt(line);
			String roman_num = convertRomanNum(arabic_num);
			System.out.println(roman_num);
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}

	}
	public static String convertRomanNum(int num) {
		String roman_num="";
		if ( num <= 0 || num >= 21 ) {
			System.out.println("1以上20以下の数字を指定して下さい");
		}else{
			int num_x = num / 10; // 左に並ぶXの数
			int ichinokurai = num % 10; // アラビア数字の一の位
			int num_v = ichinokurai / 5; // Xの次に並ぶVの数
			int num_i = ichinokurai % 5; // Vの次に並ぶIの数

			roman_num = addCharacter(roman_num, "X", num_x);

			/*
			 * アラビア数字の一の位が4と9の時は特別扱い
			 */
			if (ichinokurai == 4){
				roman_num = addCharacter(roman_num, "IV", 1);
			}else if(ichinokurai == 9){
				roman_num = addCharacter(roman_num, "IX", 1);
			}else{
				roman_num = addCharacter(roman_num, "V", num_v);
				roman_num = addCharacter(roman_num, "I", num_i);
			}
		}
		return roman_num;
	}
	/**
	 * addCharacter は、文字列に文字列を特定回数だけ追加します
	 * @param str　元の文字列
	 * @param s　追加する文字列
	 * @param n　追加する回数
	 * @return
	 */
	public static String addCharacter(String str, String s, int n) {
		for (int i = 0; i < n; i++) {
			str = str + s;
		}
		return str;
	}

}
