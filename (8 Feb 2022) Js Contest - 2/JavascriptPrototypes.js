Array.prototype.includesOneof = function (arr) {
  if (arr.length === 0) return false;
  if (typeof arr[0] === "object" || Array.isArray(arr[0])) {
    let givenArray = arr.map((elem) => JSON.stringify(elem));
    let appliedOnArray = this.map((elem) => JSON.stringify(elem));
    let removedDuplicates = new Set([...givenArray, ...appliedOnArray]);
    if (arr.length + this.length === removedDuplicates.size) return false;
    else return true;
  }
  for (let i = 0; i < arr.length; i++) {
    if (this.includes(arr[i])) return true;
  }
  return false;
};
