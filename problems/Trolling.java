
import java.util.HashMap;
public class Trolling {
	//
	String[] array = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};
	
	//google hashmap
	static String s = charToAscii(charToHex("aW五mb一NlY零NsdWJ七amF二YV九零cm九sbGluZ一九sYXN零X二RheV九mYXN零X二RheTIzNDEzNDMxMn零-"));
	public static void main(String[] args) {
		
	}
	public String decoder(String s) {
		// 於此寫字
		// los numeros, que son differentes?
		// "The numbers mason, what do they mean?"
	}
	public static String hexToChar(String hex) {
        String output = "";
        String[] hexes = hex.split(" ");
        for (int i = 0; i < hexes.length; i++) {
            output += (char) Integer.parseInt(hexes[i], 16);
        }
        return output;
    }
    public static String charToHex(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            output += Integer.toHexString((int) text.charAt(i)) + " ";
        }
        return output;
    }
    public static String binaryToChar(String binary) {
        String output = "";
        String[] binaries = binary.split(" ");
        for (int i = 0; i < binaries.length; i++) {
            output += (char) Integer.parseInt(binaries[i], 2);
        }
        return output;
    }
    public static String charToBinary(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            output += Integer.toBinaryString((int) text.charAt(i)) + " ";
        }
        return output;
    }
    public static String asciiToChar(String ascii) {
        String output = "";
        String[] asciis = ascii.split(" ");
        for (int i = 0; i < asciis.length; i++) {
            output += (char) Integer.parseInt(asciis[i]);
        }
        return output;
    }
    public static String charToAscii(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            output += (int) text.charAt(i) + " ";
        }
        return output;
    }
}
