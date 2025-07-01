package Calculator;

public class ReverseString {

	public static void main(String[] args) {
	
		String input = "Pravallika";
		String result ="";
		for(int i =input.length()-1;i>=0;i--)
		{
			result = result+input.charAt(i);
		}
		
		System.out.println("original string :" + input);
		System.out.println("reversed string :" + result);
	}

}
