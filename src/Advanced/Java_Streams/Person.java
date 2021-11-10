package Advanced.Java_Streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
}
