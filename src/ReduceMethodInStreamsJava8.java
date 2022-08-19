import java.util.Arrays;
import java.util.List;

public class ReduceMethodInStreamsJava8 {

	public static void main(String[] args) {

		List<String> fruitList = Arrays.asList("Apple", "Mango", "Orange", "Guava", "Papaya", "Watermelon", "Banana",
				"Grapes");
		
		String maxLength = fruitList.stream().reduce((fruit1,fruit2)->fruit1.length()>fruit2.length()?fruit1:fruit2).get();
		
		System.out.println(maxLength);
		
		List<Integer> numbers = Arrays.asList(1,1,1,1,1);
		
		Integer sum = numbers.stream().reduce(0,(a,b)->a+b);
		
		System.out.println(sum);

	}

}
