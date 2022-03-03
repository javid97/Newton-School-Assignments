// n is the input number
function fibonacci(n) {
  let t1 = 0;
  let t2 = 1;
  let tn = 0;
  if (n < 1) return t1;
  if (n < 2) return t2;
  for (let i = 1; i < n; i++) {
    tn = t1 + t2;
    t1 = t2;
    t2 = tn;
  }
  return tn;
}
