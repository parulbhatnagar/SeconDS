package greedy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AssignCookies {



    public int findContentChildren(int[] g, int[] s) {
        var greed = Arrays.stream(g).sorted().mapToObj(Integer::valueOf).collect(Collectors.toList());
        var cookiesTray = Arrays.stream(s).sorted().mapToObj(Integer::valueOf).collect(Collectors.toList());

        int sizeOfCookiesTray = cookiesTray.size(), sizeOfGreed = greed.size();

        int greedTraversal = 0, cookiesTrayTraversal = 0, satisfiedKids = 0;


        while (greedTraversal < sizeOfGreed && cookiesTrayTraversal < sizeOfCookiesTray){
            if (greed.get(greedTraversal) <= cookiesTray.get(cookiesTrayTraversal)){
                greedTraversal++;
                cookiesTrayTraversal++;
                satisfiedKids++;
            }
            else{
                cookiesTrayTraversal++;
            }
        }

        return satisfiedKids;
    }
}
