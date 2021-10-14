package Lab;

import java.awt.*; 

public class FontDemo {

	public static void main(String args[]) {
		Font f;
		f = new Font("TimesNewRoman", Font.BOLD + Font.ITALIC, 14);
		String font = f.getName();
		int style = f.getStyle();
		int size = f.getSize();
		boolean bold = f.isBold();
		boolean normal = f.isPlain();
		boolean italic = f.isItalic();
		System.out.println("Font : " + font + "\n Style : " + style + "\n Size : " + size + "\n Bold : " + bold+ "\n Italic : " + italic);
	}
}