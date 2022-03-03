// arr is the array of numbers, n is number of elements
function altSumProduct(arr, n) {
  // write code here
  // console.log the output in a single line,like example
  let sum = 0;
  let product = 1;
  for (let i = 0; i < n; i++)
    i % 2 == 0 ? (product *= arr[i]) : (sum += arr[i]);
  console.log(sum, product);
}
