class Entry implements Comparable<Entry> {
    public int intValue;
    public double doubleValue;
    Entry(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }
    @Override
    public int compareTo(Entry other) {
        return Double.compare(other.doubleValue,this.doubleValue);
    }
}

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Entry> pq = new PriorityQueue<>();
        for(int i = 0 ; i < classes.length ; i++){
            double increase = value0fIncrease(classes[i]);
            if(increase > 0)
                pq.add(new Entry(i,increase));
        }
        Entry entry;
        int [] clazz;
        while(extraStudents > 0 && !pq.isEmpty()){
            entry = pq.poll();
            clazz=classes[entry.intValue];
            passStudent(clazz);
            extraStudents--;    
            entry.doubleValue = value0fIncrease(clazz);
            pq.add(entry);
        }
        return totalRatio(classes);
    }

    private double value0fIncrease(int []arr){
        double ratio1 = (double) (arr[0] + 1)/(arr[1] + 1);
        double ratio2 = (double) arr[0]/arr[1];
        return ratio1 - ratio2;
    }

    private double ratio(int[] arr){
        return (double) arr[0]/arr[1];
    }

    private double totalRatio(int[][] classes){
        double total = 0;
        for(int[] arr : classes){
            total += ratio(arr);
        }
        return total/classes.length;
    }
    
    private void passStudent(int[] arr){
        arr[0]+=1;
        arr[1]+=1;
    }
}