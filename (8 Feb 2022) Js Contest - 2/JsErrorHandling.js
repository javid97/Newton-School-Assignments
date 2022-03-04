function evalString() {
  let str = document.getElementById("input1").value;
  try {
    //write your code here
    // if (/^[\+\-\*\/]/.test(str))
    //   throw new SyntaxError(
    //     "Expression should not start with invalid operator"
    //   );
    // else if (/[\+\-\*\/]$/.test(str))
    //   throw new SyntaxError(
    //     "Expression should not end with invalid operator"
    //   );
    // else if (/[a-zA-z]/.test(str)) {
    //   throw new OutOfRangeError();
    // }
    // else if (/[\+\-\*\/]?= [\+\-\*\/]/) {
    //   throw new InvalidExprError();
    // }
    // alert("passed");
  } catch (e) {
    alert("failed " + e.name + " " + e.message);
    if (window.Cypress) {
      throw e;
    }
  }
}

class OutOfRangeError extends Error {
  constructor() {
    super();
    this.name = "OutOfRangeError";
    this.message =
      "Expression should only consist of integers and +-/* characters and not 'a'";
  }
}
class InvalidExprError extends Error {
  constructor() {
    super();
    this.name = "InvalidExprError";
    this.message =
      "Expression should not have an invalid combination of expression";
  }
}

if (window.Cypress) {
  window.OutOfRangeError = OutOfRangeError;
  window.InvalidExprError = InvalidExprError;
}
