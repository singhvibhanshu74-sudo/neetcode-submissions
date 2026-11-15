class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
    for (int i = 0; i < strs.size(); i++) {
        String word = strs.get(i);
        sb.append(word.length()).append('#').append(word);
    }
    return sb.toString();
    }


    public List<String> decode(String str) {
    List<String> list = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        // 1. Slide right finger j until it hits '#'
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // 2. Read the number trapped between i and j
        int len = Integer.parseInt(str.substring(i, j));

        // 3. Scoop up 'len' characters starting right after '#' (at j + 1)
        list.add(str.substring(j + 1, j + 1 + len));

        // 4. Teleport left finger i straight to the start of the next box
        i = j + 1 + len;
    }

    return list;
}
}