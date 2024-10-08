public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
        });
        List<int[]> res=new LinkedList<>();
        for(int[] ch:people){
            res.add(ch[1],ch);
        }
    return res.toArray(new int[people.length][]);
    }
}