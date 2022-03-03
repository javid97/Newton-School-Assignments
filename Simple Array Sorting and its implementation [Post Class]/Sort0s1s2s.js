// arr is unsorted array
// n is the number of elements in the array
function zeroOneTwoSort(arr, n) {
  let high = n - 1;
  let low = 0;
  let mid = 0;
  while (mid <= high) {
    if (arr[mid] === 0) {
      [arr[mid], arr[low]] = [arr[low], arr[mid]];
      low++;
      mid++;
    } else if (arr[mid] === 1) mid++;
    else {
      [arr[mid], arr[high]] = [arr[high], arr[mid]];
      high--;
    }
  }
  return arr;
}
