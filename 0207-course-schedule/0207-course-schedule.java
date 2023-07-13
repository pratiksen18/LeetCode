class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adjList.add(new ArrayList<>());
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int preCourse = prerequisite[1];
            adjList.get(course).add(preCourse);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) if (!dfs(adjList, visited, i)) return false;
        return true;
    }
    private boolean dfs(List<List<Integer>> adjList, int[] visited, int course) {
        if (visited[course] == 1) return false;
        if (visited[course] == -1) return true;
        visited[course] = 1;
        for (int preCourse : adjList.get(course)) if (!dfs(adjList, visited, preCourse)) return false;
        visited[course] = -1;
        return true;
    }
}