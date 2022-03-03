// n is size of array, arr is the array
function simpleArrangement(n, arr) {
  let res = [];
  for (let i = 0; i < n; i++) res[i] = arr[arr[i]];
  return res;
}
