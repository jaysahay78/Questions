package com.company;

import java.util.*;

public class mergeAccounts {
    static List<List<String>> accountsMerge(List<List<String>> accounts){
        int n = accounts.size();
        disjointSet ds = new disjointSet(n);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String mail = accounts.get(i).get(j);
                if (!map.containsKey(mail)) {
                    map.put(mail, i);
                } else {
                    ds.unionBySize(i, map.get(mail));
                }
            }
        }

        ArrayList<String>[] mergedMail = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            mergedMail[i] = new ArrayList<>();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String mail = entry.getKey();
            int node = ds.findUltPar(entry.getValue());
            mergedMail[node].add(mail);
        }

        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mergedMail[i].size() == 0) continue;

            Collections.sort(mergedMail[i]);
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(ds.findUltPar(i)).get(0));
            temp.addAll(mergedMail[i]);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList() {
            {
                add(new ArrayList<String>(Arrays.asList("David","Avid0@m.co","David0@m.co","David1@m.co")));
                add(new ArrayList<String>(Arrays.asList("David","Gvid3@m.co","David3@m.co","David4@m.co")));
                add(new ArrayList<String>(Arrays.asList("David","David4@m.co","David5@m.co")));
                add(new ArrayList<String>(Arrays.asList("David","David2@m.co","David3@m.co")));
                add(new ArrayList<String>(Arrays.asList("David","David1@m.co","David2@m.co")));

            }
        };
        System.out.println(accountsMerge(accounts));
    }
}
