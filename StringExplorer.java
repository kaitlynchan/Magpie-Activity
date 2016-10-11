

public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		int notFoundPsn = sample.indexOf("slow");
		int test = sample.indexOf("over", 13);
		System.out.println("sample.indexOf(\"quick\") = " + position);
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		System.out.println("sample.indexOf(\"over\") = " + test);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

	}

}