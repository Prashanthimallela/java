import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class StreamClass {
    public static <stream> void main(String... args){
        List<String>names=Arrays.asList("konda","prashu","srija","suppu");
        Stream<String> namesStream=names.stream();
        namesStream.filter(x->x.startsWith("s")).sorted().map(s -> s+"moris").forEach(n->System.out.println(n));
    }

}
// create a Stream of String Collection and filter all the names that start with 'S'
// and then append 'Moris' to all those names and then display