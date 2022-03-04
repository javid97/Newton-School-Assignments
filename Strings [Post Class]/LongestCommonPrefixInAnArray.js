// n is number of individual space separated strings inside strings variable,
// strings is the string which contains space separated words.
function longestCommonPrefix(strings, n) {
  if (n === 1) return strings;
  strings = strings.split(" ");
  let commonPrefix = "-1";
  for (let i = 0; i < strings[0].length; i++) {
    const char = strings[0][i];
    for (let j = 1; j < n; j++) if (strings[j][i] != char) return commonPrefix;

    commonPrefix === "-1" ? (commonPrefix = char) : (commonPrefix += char);
  }
  return commonPrefix;
}
