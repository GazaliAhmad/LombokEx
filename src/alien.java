import lombok.*;
@Data
@Builder
@ToString(includeFieldNames = false)
public class alien {
	private String name;
	private int age;
	private String color;
}
