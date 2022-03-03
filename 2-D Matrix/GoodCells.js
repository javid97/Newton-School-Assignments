// mat is the matrix/ 2d array
// n,m are dimensions
function goodCell(mat, n, m) {
  let count = 0;
  for (let i = 1; i < n - 1; i++) {
    for (let j = 1; j < m - 1; j++) {
      if (
        mat[i - 1][j] === 1 &&
        mat[i + 1][j] === 1 &&
        mat[i][j - 1] === 1 &&
        mat[i][j + 1] === 1
      )
        count++;
    }
  }
  return count;
}
