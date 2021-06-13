import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Anti Diagonals
        Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

        Example:

        Input:

        1 2 3
        4 5 6
        7 8 9

        Return the following :

        [
        [1],
        [2, 4],
        [3, 5, 7],
        [6, 8],
        [9]
        ]
        Input :
        1 2
        3 4

        Return the following  :

        [
        [1],
        [2, 3],
        [4]
        ]*/
public class antiDiagonal {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                ArrayList<Integer> a = new ArrayList<>();
                if (!hm.containsKey(i + j)) {
                    a.add(A[i][j]);
                    hm.put((i + j), a);
                } else {
                    ArrayList<Integer> t = hm.get(i + j);
                    t.add(A[i][j]);
                    hm.put((i + j), t);
                }
            }
        }
        int res[][] = new int[hm.size()][];
        for (Map.Entry<Integer, ArrayList<Integer>> e : hm.entrySet()) {
            List<Integer> l = e.getValue();
            int key = e.getKey();
            res[key] = l.stream().mapToInt(k -> k).toArray();
        }
        //return res;
    }
}
