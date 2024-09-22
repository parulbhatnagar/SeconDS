package greedy;

public class TheClass {

    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();

        int [] greed = {1,2,3,2,1};
        int [] cookiesSize = {1,1,2,2,2};

        System.out.println("number of children" + assignCookies.findContentChildren(greed,cookiesSize));
    }
}
