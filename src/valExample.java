import lombok.val;
import java.util.ArrayList;

public class valExample {
	public String example() {
		val example = new ArrayList<String>();
		example.add("\nHello. This is from valExample");
		val foo = example.get(0);
		return foo.toUpperCase();
	}
}


