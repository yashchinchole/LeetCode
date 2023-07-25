class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ansList = new ArrayList<List<Integer>>();

        if (numRows <= 0)
            return ansList;

        ArrayList<Integer> prevList = new ArrayList<>();
        prevList.add(1);

        ansList.add(prevList);

        for (int i = 0; i < numRows - 1; i++) {
            ArrayList<Integer> currList = new ArrayList<>();

            currList.add(1);

            for (int j = 0; j < prevList.size() - 1; j++)
                currList.add(prevList.get(j) + prevList.get(j + 1));

            currList.add(1);

            ansList.add(currList);
            prevList = currList;
        }

        return ansList;
    }
}