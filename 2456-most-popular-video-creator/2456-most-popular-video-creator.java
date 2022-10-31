class Solution {

    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap<String, Long> map_max = new HashMap<>(); //count maximum score
        HashMap<String, Integer> map = new HashMap<>();  //count totle score
        HashMap<String, ArrayList<Pair>> id = new HashMap<>(); //store ids in order with their views
        List<List<String>> ans = new ArrayList<>();
        long max = 0;
        for (int i = 0; i < views.length; i++) {
            if (!map.containsKey(creators[i])) map.put(creators[i], 0);
            if (!id.containsKey(creators[i])) id.put(creators[i], new ArrayList<>());
            if (!map_max.containsKey(creators[i])) map_max.put(creators[i], (long) 0);
			
			
            map.put(creators[i], map.get(creators[i]) + views[i]); //calculate score
            id.get(creators[i]).add(new Pair(ids[i], views[i]));
            map_max.put(creators[i], Math.max(map_max.get(creators[i]), views[i])); //store max score

        }
        for (long num : map.values()) {
            max = Math.max(max, num);
        }
        ArrayList<Pair> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                Collections.sort(id.get(key), (o1, o2) -> (o1.str.compareTo(o2.str))); //sort by lexicographical order
                for (Pair p : id.get(key)) {
                    if (p.num == map_max.get(key)) {
                        ans.add(new ArrayList<>(Arrays.asList(key, p.str)));
                        break;
                    }
                }
            }
        }


        return ans;
    }
	
    class Pair {
        String str;
        long num;
        Pair(String s, long n) {
            str = s;
            num = n;
        }
    }

}