class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballMap = new HashMap();
        HashMap<Integer, Integer> colorMap = new HashMap();
        int length = queries.length;
        int[] result = new int[length];

        for(int idx = 0; idx < length; idx++) {
            int[] query = queries[idx];
            int ballNo = query[0], color = query[1];

            if(ballMap.containsKey(ballNo)) {
                int prevColor = ballMap.get(ballNo);
                colorMap.put(prevColor, colorMap.get(prevColor) - 1);
                if(colorMap.get(prevColor) == 0)
                    colorMap.remove(prevColor);
            }

            ballMap.put(ballNo, color);
            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);

            result[idx] = colorMap.size();
        }

        return result;
    }
}