import lombok.*;

@AllArgsConstructor
@Getter
@ToString(includeFieldNames = false)
@Builder
public class player {
	@Setter private String name;
	private int age;
	@Setter private String skillLevel;
}
