import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class player {
	private int age;
	@Setter private String name;
	@Setter private String skillLevel;
}
