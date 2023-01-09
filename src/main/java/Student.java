import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    public int id;
    public String firstName;
    public String secondName;
    public String parentName;
    public String parentPhoneNumber;
    public int classNumber;
}
