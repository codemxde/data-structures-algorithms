// # Finding Special Index in an Array using JavaScript 😇

const createPrefixSumArrays = function (arr, pSumEven, pSumOdd) {
  pSumEven[0] = arr[0];
  pSumOdd[0] = 0;

  for (let i = 1; i < arr.length; i++) {
    if (i % 2 == 0) {
      pSumEven[i] = pSumEven[i - 1] + arr[i];
      pSumOdd[i] = pSumOdd[i - 1];
    } else {
      pSumOdd[i] = pSumOdd[i - 1] + arr[i];
      pSumEven[i] = pSumEven[i - 1];
    }
  }
};

const findSpecialIndex = function (arr) {
  // * declaring odd and even prefix sum arrays
  const pSumEven = [];
  const pSumOdd = [];

  const N = arr.length;
  let specialIndexes = 0;

  // * creating even and odd prefix sum
  createPrefixSumArrays(arr, pSumEven, pSumOdd);

  // * checking edge case at index '0
  if (pSumEven[N - 1] - arr[0] == pSumOdd[N - 1]) {
    console.log(`found special index at i: 0`);
    specialIndexes++;
  }

  // * checking rest of the indexes
  for (let i = 1; i < N; i++) {
    const oddSum = pSumOdd[i - 1] + pSumEven[N - 1] - pSumEven[i];
    const evenSum = pSumEven[i - 1] + pSumOdd[N - 1] - pSumOdd[i];

    if (oddSum == evenSum) {
      console.log(`found special index at i: ${i}`);
      specialIndexes++;
    }
  }
};

// const arr = [2, 1, 6, 4];
const arr = [1, 1, 1];
findSpecialIndex(arr);
