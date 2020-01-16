package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String funkyS = "";
		int sLength = s.length();
		
		for (int i = sLength -1; i > -1; i--) {
			char schar = s.charAt(i);
			funkyS += schar;
		}
		
		return funkyS;
	}

}
