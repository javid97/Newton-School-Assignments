function averageMe(sizeOfArray, array) {
  return Math.floor(
    array.reduce((sum, height) => (sum += height), 0) / sizeOfArray
  );
}
