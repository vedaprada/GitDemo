import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,2,3,4,4,6,7,7,8);
//		Set<Integer> set = list.stream().collect(Collectors.toSet());
//		set.stream().forEach(System.out::println);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-----------OR------------");
		list.stream().distinct().forEach(System.out::println);

	}

}
