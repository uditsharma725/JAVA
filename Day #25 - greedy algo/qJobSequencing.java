import java.util.*;

public class qJobSequencing {

    static class Jobs {
        int deadline;
        int profit;
        int id;

        public Jobs(int i, int p ,int d) {
            this.deadline = d;
            this.profit = p;
            this.id = i;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int jobInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
            
            ArrayList<Jobs> job = new ArrayList<>();
            for(int i=0; i<jobInfo.length; i++) job.add(new Jobs(i, jobInfo[i][1], jobInfo[i][0]));

            Collections.sort(job, (a,b) -> b.profit-a.profit); //descending (switch a and b for ascending)
            //Collections.sort(job, (a,b) -> a.profit-b.profit)  for asending order sorting

            int time = 0;
            ArrayList<Integer> seq = new ArrayList<>();
            for(int i=0; i<job.size(); i++) {
                Jobs curr = job.get(i);
                if(curr.deadline > time) {
                    time++;
                    seq.add(curr.id);
                }
            }

           for(int i=0; i<seq.size(); i++) {
                System.out.println(seq.get(i));
           }
            
        } finally {
            sc.close();
        }

    }
}