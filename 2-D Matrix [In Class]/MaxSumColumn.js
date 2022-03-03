// mat is the matrix/ 2d array
// the dimensions of array are:- a rows, b columns
function colMaxSum(mat, a, b) {
  // write code here
  // do not console.log
  // return the answer as a number

  let idx = -1;

  // Variable to store max sum
  let maxSum = Number.MIN_VALUE;

  // Traverse matrix column wise
  for (let i = 0; i < b; i++) {
    let sum = 0;

    // calculate sum of column
    for (let j = 0; j < a; j++) {
      sum += mat[j][i];
    }

    // Update maxSum if it is
    // less than current sum
    if (sum > maxSum) {
      maxSum = sum;

      // store index
      idx = i;
    }
  }

  let res;

  res = [idx, maxSum];

  // return result
  return maxSum;
}
