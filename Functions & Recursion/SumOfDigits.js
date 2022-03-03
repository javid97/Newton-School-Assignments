// n is the input number
function recSum(n) {
  if (n <= 0) return 0;
  return (n % 10) + recSum(Math.floor(n / 10));
}
