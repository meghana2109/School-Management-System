import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher {

    public int id;
    public String firstName;
    public String secondName;
    public String[] subjects;
    public long contactNumber;

}
