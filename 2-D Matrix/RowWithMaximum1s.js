// mat is the matrix/ 2d array
// n,m are dimensions
function max1Row(mat, n, m) {
  let idx = 0;
  let maxOnes = 0;
  for (let i = 0; i < n; i++) {
    let ones = 0;
    for (let j = 0; j < m; j++) {
      if (arr[i][j] === 1) ones++;
    }
    if (ones > maxOnes) {
      maxOnes = ones;
      idx = i;
    }
  }
  return idx;
}
