import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    private static int numUniqueEmails(String[] emails) {
        Set<String> hashSet = new HashSet<>();

        for (String email: emails) {
            String[] fullEmail = email.split("@");
            String local = fullEmail[0];
            String domain = fullEmail[1];
            local = cleanUp(local);
            hashSet.add(local + "@" + domain);
        }
        return hashSet.size();
    }

    private static String cleanUp(String a) {
        if (a.contains(".")) {
            a = a.replace(".", "");
        }
        if (a.contains("+")) {
            String[] aArr = a.split("\\+");
            a = aArr[0];
        }
        return a;
    }
    public static void main(String[] args) {
        String[] emails =new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));
    }
}
