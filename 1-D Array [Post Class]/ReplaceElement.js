// arr is the array of numbers, n is the number of elements
function replaceArray(arr, n) {
  // write code here
  // do not console.log
  // return the new array
  let res = [];
  res[0] = arr[0] * arr[1];
  for (let i = 1; i < n - 1; i++) res[i] = arr[i - 1] * arr[i + 1];
  res[res.length] = arr[n - 1] * arr[n - 2];
  return res;
}
