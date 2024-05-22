package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("South indians speak Tamil");
	}
	private void northIndia() {
		System.out.println("South indians speak Hindi");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		StateDetails s = new StateDetails();
		l.tamilLanguage();
		l.hindiLanguage();
		l.englishLanguage();
		s.southIndia();
		s.northIndia();
		
	}

}
