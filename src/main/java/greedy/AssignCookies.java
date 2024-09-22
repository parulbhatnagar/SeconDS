package greedy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AssignCookies {



    public int findContentChildren(int[] g, int[] s) {

        // convert int[] g to List of Integer
        // then we will sort it
        var greed = Arrays.stream(g).sorted().mapToObj(Integer::valueOf).collect(Collectors.toUnmodifiableList());
        var cookies = Arrays.stream(s).sorted().mapToObj(Integer::valueOf).collect(Collectors.toUnmodifiableList());

        int returnValue;
        System.out.println(greed);

        System.out.println(cookies);

        // cookies.forEach(integer -> integer);





        return 0;
    }
}
