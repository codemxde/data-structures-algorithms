def createPrefixSum(arr:list):
    pSum = [0] * len(arr)
    pSum[0] = arr[0]

    for i in range (1, len(arr)):
        pSum[i] = pSum[i - 1] + arr[i]
    
    return pSum

def findEquilibriumIndex(arr: list):
    pSum = createPrefixSum(arr=arr)
    N = len(pSum)

    if (pSum[N - 1] - pSum[0] == 0):
        print("found special index at i: 0")
    
    for i in range(1, N):
        leftSum = pSum[i - 1]
        rightSum = pSum[N - 1] - pSum[i]

        if (leftSum == rightSum):
            print(f"found special index at i: {i}")


arr = [-7, 1, 5, 2, -4, 3, 0]
findEquilibriumIndex(arr=arr)