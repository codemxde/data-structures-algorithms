// # Rotating Array in JavScript 🤌🏻

const reverseArray = function (startIndex, endIndex, arr) {
  while (startIndex < endIndex) {
    const temp = arr[startIndex];
    arr[startIndex] = arr[endIndex];
    arr[endIndex] = temp;

    startIndex++;
    endIndex--;
  }
};

const rotateArray = function (K, arr) {
  const N = arr.length;
  K = K % N;

  // * firstly reversing entire array
  reverseArray(0, N - 1, arr);

  // * reverse first half of array
  reverseArray(0, K - 1, arr);

  // * reverse second half of array
  reverseArray(K, N - 1, arr);
};

const arr = [1, 2, 3, 4, 5, 6, 7];
rotateArray(4, arr);
console.log("ater shifting: " + arr);
