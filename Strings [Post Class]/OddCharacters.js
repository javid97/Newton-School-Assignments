// str is input
function oddChars(str) {
  let res = "";
  for (let i = 0; i < str.length; i++) {
    if (i % 2 === 0) res += str[i] + " ";
  }
  return res;
}
