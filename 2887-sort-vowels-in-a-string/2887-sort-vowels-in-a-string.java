class Solution {
    public String sortVowels(String s) {
        Set<Character> vs = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> v = new ArrayList<>();

        for (char c : s.toCharArray())
            if (vs.contains(c))
                v.add(c);

        Collections.sort(v);

        StringBuilder r = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (vs.contains(c))
                r.append(v.get(index++));
            else
                r.append(c);
        }

        return r.toString();
    }
}