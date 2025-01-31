import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amar");
		names.add("Robbie");
		names.add("Abhijeet");
		names.add("Ananya");
		names.add("Rita");
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> l = Arrays.asList("Zeba", "Mehak", "Puja", "Yathish", "Amar");
		l.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		l.stream().filter(s->s.length()<5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("---------------------------------------------------");
		List<String> l2 = Arrays.asList("Reha", "Kamal", "Rutuj", "uma");
		Stream<String> newStream = Stream.concat(l.stream(), l2.stream()).sorted();
		//newStream.forEach(s->System.out.println(s)); //this statement is commented out because you cannot reuse the same stream again and again.
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Reha"));
		System.out.println(flag);
		
	}

}
