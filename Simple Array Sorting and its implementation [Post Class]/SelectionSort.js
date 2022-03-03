// arr is unsorted array
// n is the number of elements in the array
function selectionSort(arr, n) {
  for (let i = 0; i < n; i++) {
    let min = arr[i];
    let idx = i;
    for (let j = i; j < n; j++) {
      if (arr[j] < min) {
        min = arr[j];
        idx = j;
      }
    }
    [arr[i], arr[idx]] = [arr[idx], arr[i]];
  }
  return arr;
}
