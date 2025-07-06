package SeleniumDemo.SeleniumDemo;

import java.util.Date;

public class GenerateTimeStampDate {

	public static void main(String[] args) {
		Date date = new Date();
		String StringDate= date.toString();
		String nospaceDate= StringDate.replaceAll("\\s","");
		String noColonspaceDate= nospaceDate.replaceAll("\\:","");
		System.out.println(noColonspaceDate + "@gmail.com");
		
	}

}
