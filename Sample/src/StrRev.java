
public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		replace();


	}
	public static void replace() {
		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
		String toBeReplaced = "selenium";
		String toReplacedWith = " ";
		String[] astr = str.split(toBeReplaced);
		StringBuffer strb = new StringBuffer();
		for ( int i = 0; i <= astr.length-1; i++ ) {
			for(int j=astr[i].length()-1;j>0;j-- )
			{			
			
				strb = strb.append( astr[i].charAt(j) );
		}
				if (i != astr.length - 1) {
				strb = strb.append(toReplacedWith);
				}
		}
		System.out.println(strb);
		}
}
