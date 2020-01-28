
public class ReplaceCoding {
	public static void main(String[] args) {
		String sample = "\tWe are going to replace newline character \n ";
//		sample =sample.replace("\\n", "").replace("\\t", "");
		sample =sample.replaceAll("\\n","");
		 System.out.println(sample);
		 String sample2 = "import java.util.Scanner;\\nclass CodingExercise{\\n public static void main(String a";
		 sample2 = sample2.replaceAll("\\n", "");
		 System.out.println(sample2);
		 
	}
}
