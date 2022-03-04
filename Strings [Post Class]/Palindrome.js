// s is input
function palindrome(s) {
  let countChanges = 0;
  if (s.length === 1) return 0;
  let low = 0;
  let high = s.length - 1;
  while (low < high) {
    if (s[low] !== s[high]) countChanges++;
    low++;
    high--;
  }
  return countChanges;
}
