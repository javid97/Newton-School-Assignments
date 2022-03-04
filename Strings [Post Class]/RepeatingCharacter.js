// ignore test case number as input
// str is the input string
function leftMostOcurringChar(str) {
  str = str.split("");
  for (let i = 0; i < str.length; i++) {
    let s = str.slice(i + 1, str.length);
    if (s.includes(str[i])) return str[i];
  }
  return "-1";
}
