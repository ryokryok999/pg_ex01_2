package pg_ex01_2;

public class RomanNumerals {

	public static void main(String[] args) {
		int num = 5;
		int num_x = num / 10;
		int ichinokurai = num % 10;
		int num_v = ichinokurai / 5;
		int num_i = ichinokurai % 5;

		String roman_num="";

		while (num_x > 0){
			roman_num = roman_num + "X";
			num_x--;
		}

		if (ichinokurai == 4){
			roman_num = roman_num + "IV";
		}else if(ichinokurai == 9){
			roman_num = roman_num + "IX";
		}else{
			while (num_v > 0){
				roman_num = roman_num + "V";
				num_v--;
			}

			while (num_i > 0){
				roman_num = roman_num + "I";
				num_i--;
			}
		}
		System.out.println(roman_num);
	}

}
