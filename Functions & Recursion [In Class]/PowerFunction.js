// X and Y are numbers
// ignore number of testcases variable
function pow(X, Y) {
  console.log(helper(X, Y).toFixed(2));
}

function helper(X, Y) {
  if (Y === 0) return 1;
  if (Y < 0) {
    X = 1 / X;
    Y *= -1;
  }
  let temp;
  temp = helper(X, parseInt(Y / 2));
  if (Y % 2 === 0) return temp * temp;
  return X * temp * temp;
}
