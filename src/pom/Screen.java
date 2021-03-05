package pom;

import java.io.IOException;

import baseclass.BaseClass;


public class Screen extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		loadUrl("http://www.greenstechnologys.com/");
		maximize();
		screenshot("G:\\\\green1.png");
	}

}
