// arr is the array of numbers, n is the number of elements
function sumAndMean(arr, n) {
  const sum = arr.reduce((sum, num) => (sum += num), 0);
  return [sum, Math.floor(sum / n)];
}
