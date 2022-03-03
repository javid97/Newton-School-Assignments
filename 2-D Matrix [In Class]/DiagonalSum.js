// mat is the matrix/ 2d array
// the dimensions of array are n * n
function diagonalSum(mat, n) {
  // write code here
  // console.log the answer as in example
  let primarySum = 0;
  let secondarySum = 0;
  for (let i = 0; i < n; i++) {
    primarySum += mat[i][i];
    secondarySum += mat[i][n - i - 1];
  }
  console.log(primarySum, secondarySum);
}
