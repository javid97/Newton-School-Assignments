// str1 and str2 are the two input strings
function isAnagram(str1, str2) {
  if (str1.length !== str2.length) return "NO";
  const s1 = str1.split("").sort().join("");
  const s2 = str2.split("").sort().join("");
  return s1 === s2 ? "YES" : "NO";
}
