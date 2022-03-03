function sumOfProductOfDigits(n1, n2) {
  if (n1 === 0 && n2 === 0) return 0;
  const sum = (n1 % 10) * (n2 % 10);
  n1 = Math.floor(n1 / 10);
  n2 = Math.floor(n2 / 10);
  return sum + sumOfProductOfDigits(n1, n2);
}
