// arr is unsorted arr
// n is the number of elements in the arr
function mergeSort(arr, n) {
  const half = Math.floor(n / 2);
  if (n < 2) return arr;
  const left = arr.splice(0, half);
  return merge(mergeSort(left, left.length), mergeSort(arr, arr.length));
}

function merge(left, right) {
  let arr = [];
  while (left.length && right.length) {
    if (left[0] < right[0]) {
      arr.push(left.shift());
    } else {
      arr.push(right.shift());
    }
  }
  return [...arr, ...left, ...right];
}
