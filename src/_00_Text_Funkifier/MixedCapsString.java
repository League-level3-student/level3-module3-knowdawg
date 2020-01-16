package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		int sLength = s.length();
		String mixedS = "";
		
		for (int i = 0; i < sLength; i++) {
			char schar = s.charAt(i);
			if (i % 2 == 0) {
				mixedS += (schar + "").toLowerCase();
			} else {
				mixedS += (schar + "").toUpperCase();
			}
		}
		return mixedS;
	}

}
