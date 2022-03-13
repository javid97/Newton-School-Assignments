// n is the input number
function sqrt(n) {
  if (n === 0 || n === 1) return n;
  let result = 1;
  let i = 1;
  while (result <= n) {
    i++;
    result = i * i;
  }
  return i - 1;
}
