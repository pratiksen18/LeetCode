// Java Solution:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create an array list to store the output result...
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        // Base cases...
	    if (numRows <= 0)  return output;
        // Create an array list to store the prev triangle value for further addition...
	    ArrayList<Integer> prev = new ArrayList<Integer>();
        // Inserting for the first row & store the prev array to the output array...
	    prev.add(1);
	    output.add(prev);
        // For rest of the rows, Traverse all elements through a for loop...
	    for (int i = 2; i <= numRows; i++) {
            // Create another array to store the current triangle value...
		    ArrayList<Integer> curr = new ArrayList<Integer>();
		    curr.add(1);    //first
            // Calculate for each of the next values...
		    for (int j = 0; j < prev.size() - 1; j++) {
                // Inserting the addition of the prev arry two values...
			    curr.add(prev.get(j) + prev.get(j + 1));    //middle
		    }
            // Store the number 1...
		    curr.add(1);    //last
            // Store the value in the Output array...
		    output.add(curr);
            // Set prev is equal to curr...
		    prev = curr;
	    }
	    return output;      // Return the output list of pascal values...
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> output;
        // Base cases...
        if(numRows == 0)  return output;
        // Traverse all the elements through a loop
        for(int i=0; i<numRows; i++)
            output.push_back(vector<int>(i + 1, 1));    // Initialize the first row of the pascal triangle as {1}.
        // For generating each row of the triangle...
        for (int i = 2; i < numRows; ++i)
            // Run an inner loop from j = 1 to j = {previous row size} for calculating element of each row of the triangle.
            for (int j = 1; j < output[i].size() - 1; ++j)
                // Calculate the elements of a row, add each pair of adjacent elements of the previous row in each step of the inner loop.
                output[i][j] = output[i - 1][j - 1] + output[i - 1][j];
        return output;      // After the inner loop gets over, simply output the row generated.
    }
};

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
class Solution(object):
    def generate(self, numRows):
        # Create an array list to store the output result...
        output = []
        for i in range(numRows):
            if(i == 0):
                # Create a list to store the prev triangle value for further addition...
                # Inserting for the first row & store the prev array to the output array...
                prev = [1]
                output.append(prev)
            else:
                curr = [1]
                j = 1
                # Calculate for each of the next values...
                while(j < i):
                    # Inserting the addition of the prev arry two values...
                    curr.append(prev[j-1] + prev[j])
                    j+=1
                # Store the number 1...
                curr.append(1)
                # Store the value in the Output array...
                output.append(curr)
                # Set prev is equal to curr...
                prev = curr
        return output       # Return the output list of pascal values...

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                        
// JavaScript Solution:
var generate = function(numRows) {
    var i = 0;
    var j = 0;
    // Create an array list to store the output result...
    var res = [];
    // For generating each row of the triangle...
    for (i = 0; i < numRows; i++) {
        res.push(Array(i + 1));       // Initialize the first row of the pascal triangle as {1}...
        for (j = 0; j <= i; j++) {
            // Primary...
            if (j === 0 || j === i) {
                res[i][j] = 1;
            }
            else {
                // Calculate the elements of a row, add each pair of adjacent elements of the previous row in each step of the inner loop.
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
        }
    }
    return res;      // Return the output list of pascal values...
};
