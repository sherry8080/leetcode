package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        int ans = 0;

        for (String email : emails) {
            int index = email.indexOf("@");
            String local = email.substring(0,index);
            String domain = email.substring(index + 1, email.length() - 1);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", "");
            email = local + "@" + domain;
            if(set.contains(email)){
                continue;
            }
            else{
                set.add(email);
                ans++;
            }
        }
        return ans;
}

    public static void main(String args[]) {
        String[] str = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        UniqueEmail u = new UniqueEmail();
        System.out.println(u.numUniqueEmails(str));
    }
}
