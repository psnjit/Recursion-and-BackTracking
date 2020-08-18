/* =======================
Interview bit- https://www.interviewbit.com/problems/subset/

i/p- [1,2,3]

o/p- [
  [],
  [1],
  [1, 2],
  [1, 2, 3],
  [1, 3],
  [2],
  [2, 3],
  [3],
]

explanation- display all the subsets(powerset) of a given set lexicographically
===========================*/

public class Solution
{
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) 
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
       Collections.sort(A);
       subset(res, A, new ArrayList<Integer>(), 0);
       return res;
    }
    public void subset(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> a, ArrayList<Integer> al, int ind )
    {
        res.add(new ArrayList<>(al));
        
        for(int i=ind; i<a.size(); i++)
        {
            al.add(a.get(i));
            subset(res, a, al, i+1);
            al.remove(al.size()-1);
        }
    }
}
