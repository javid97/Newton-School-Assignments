// n is the number of disks
function towerOfHanoiSequence(n, a = "A", b = "B", c = "C") {
  if (n < 1) return;
  towerOfHanoiSequence(n - 1, a, c, b);
  console.log(`${n}:${a}->${c}`);
  towerOfHanoiSequence(n - 1, b, a, c);
}
