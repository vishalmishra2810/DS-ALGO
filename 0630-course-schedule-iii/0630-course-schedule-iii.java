class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (c1, c2) -> Integer.compare(c1[1], c2[1]));
        // Max Heap to track the max duration courses
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
 
        int time = 0;
        for (int[] course : courses) {
            int duration = course[0], lastDay = course[1];
            time += duration;
            heap.add(duration);
            if (time > lastDay) {  // if pass the last day, remove the courses takes longest time.
                time -= heap.poll();
            }
        }
        return heap.size();
    }
}
