// # Finding Equilibrium Index using JavaScript 🔥

const createPrefixSumArrays = function (pSum, arr) {
  pSum[0] = arr[0];
  for (let i = 1; i < arr.length; i++) {
    pSum[i] = pSum[i - 1] + arr[i];
  }
};

const findSepcialIndex = function (arr) {
  const N = arr.length;
  // * declare even and odd prefix sum arrays
  pSum = new Array(arr.length);

  // * creating the prefix sum arrays
  createPrefixSumArrays(pSum, arr);

  // * checking edge case at index '0'
  if (pSum[N - 1] - pSum[0] == 0) {
    console.log(`found equilibrium index at i: 0`);
  }

  // * finding if other equilibrium indexes are there
  for (let i = 1; i < arr.length; i++) {
    const leftSum = pSum[i - 1];
    const rightSum = pSum[N - 1] - pSum[i];

    if (leftSum == rightSum) {
      console.log(`found equilibrium index at i: ${i}`);
    }
  }
};

const arr = [-7, 1, 5, 2, -4, 3, 0];
findSepcialIndex(arr);
