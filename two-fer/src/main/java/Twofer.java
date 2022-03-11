import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
//       name=(name==null)?"you":name;
//        return "One for "+name+", one for me.";
        return String.format("One for %s, one for me.", Optional.ofNullable(name).orElse("you"));

    }

}
