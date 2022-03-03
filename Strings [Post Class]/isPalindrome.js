// str is input
function isPalindrome(str) {
  let low = 0;
  let high = str.length - 1;
  while (low <= high) {
    if (str[low] !== str[high]) return 0;
    low++;
    high--;
  }
  return 1;
}
