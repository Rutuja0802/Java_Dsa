//count vowels,digit,UpperCase,LowerCase;using inbuit functions;
public class String1 {
	public static void main(String[] args) {
		String str= "Rutuja0804aeiou";
		CountEverything(str);
		
	}
	public static void CountEverything(String str) {
		int v=0;//vowel
		int d=0;//digit;
		int L=0;//Lowercase
		int U=0;//uppercase
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				L++;
			}else if(Character.isUpperCase(ch)) {
				U++;
			}else if(Character.isDigit(ch)) {
				d++;
			}
//			if(ch=="a"||ch=="e"|| ch=="i"||ch=="o"||ch=="u"||ch=="A"||ch=="E"||ch=="I"||ch=="O"||ch=="U";){
//				v++;
//			}
		}
		System.out.println("uppercase count :" + U);
		System.out.println("lowercase count :" + L);
		System.out.println("digit count : " + d );
		System.out.println("vowel count : " + v);
	}
	}

	