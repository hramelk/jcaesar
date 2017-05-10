public class Prog {
	
	public static void main(String[] args) {
		String open = "XYZxyz";
		int key = 1;
		System.out.println("OPEN: " + open);
		String coded = Caesar.encode(open, key);
		System.out.println("CODE: " + coded);
		String decoded = Caesar.decode(coded, key);
		System.out.println("DECO: " + decoded);
		
		System.out.println("All in one");
		System.out.println("OPEN: " + open);
		String codedAIO = Caesar.encodeDecode(open, key, Caesar.encode);
		System.out.println("CODE: " + codedAIO);
		String decodedAIO = Caesar.encodeDecode(coded, key, Caesar.decode);
		System.out.println("DECO: " + decodedAIO);
	}
}
