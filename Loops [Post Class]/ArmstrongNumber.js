function isArmstrong(n) {
  const num = n;
  let sum = 0;
  while (n > 0) {
    sum += Math.pow(n % 10, 3);
    n = Math.floor(n / 10);
  }
  return sum === num;
}
