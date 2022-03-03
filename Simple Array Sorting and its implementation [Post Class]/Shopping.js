// prices is array containing price of items
// n is the number of elements in the array
// k is the number of elements to buy
function supermarket(prices, n, k) {
  prices.sort((a, b) => a - b);
  let totalCost = 0;
  for (let i = 2; i < k + 2; i++) totalCost += prices[i];
  return totalCost;
}
