// num is input number
function reverseNumber(num) {
  let reversed = "";
  while (num > 0) {
    reversed += num % 10;
    num = Math.floor(num / 10);
  }
  return Number(reversed);
}
