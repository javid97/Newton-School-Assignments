function Sum(str) {
  return str.split("").reduce((sum, digit) => (sum += Number(digit)), 0);
}
