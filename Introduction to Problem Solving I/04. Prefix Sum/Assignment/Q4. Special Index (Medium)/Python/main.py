def createPrefixSumArrays(arr: list):
    pSumEven = [0] * len(arr)
    pSumOdd = [0] * len(arr)

    # initialising values at index 0
    pSumEven[0] = arr[0]
    pSumOdd[0] = 0

    for i in range(1, len(arr)):
        if i % 2 == 0:
            pSumEven[i] = pSumEven[i - 1] + arr[i]
            pSumOdd[i] = pSumOdd[i - 1]
        else:
            pSumOdd[i] = pSumOdd[i - 1] + arr[i]
            pSumEven[i] = pSumEven[i - 1]
    return pSumEven, pSumOdd

def find_special_index(arr: list):
    N = len(arr)
    special_indexes = 0
    # creating prefix sum arrays
    pSumEven, pSumOdd = createPrefixSumArrays(arr=arr)

    # checking at index '0
    if pSumEven[N - 1] - arr[0] == pSumOdd[N - 1]:
        print(f"found special index at i : 0")
        special_indexes += 1
    
    # finding at rest of the indexes
    for i in range(1, N):
        sumOdd = pSumOdd[i - 1] + pSumEven[N - 1] - pSumEven[i]
        sumEven = pSumEven[i - 1] + pSumOdd[N - 1] - pSumOdd[i]

        if sumEven == sumOdd:
            print(f"found special index at i : {i}")
            special_indexes += 1

arr = [1,1,1]
find_special_index(arr=arr)
