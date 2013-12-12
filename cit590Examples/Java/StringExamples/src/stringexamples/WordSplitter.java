package stringexamples;

public class WordSplitter {
  public static final String EXAMPLE_TEST = "This is,.!@ my small example "
      + "string which I'm going to " + "use for pattern matching.";

  public static void main(String[] args) {
	//the line below is basically asking, does the string contain 
    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
    System.out.println(splitString.length);
    for (String string : splitString) {
      System.out.println(string);
    }
    // replace all whitespace with tabs
    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    
  }
}