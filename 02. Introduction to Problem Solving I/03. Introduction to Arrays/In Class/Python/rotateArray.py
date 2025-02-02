# rotating array with python 🐍

def reverse_list(start_index: int, end_index: int, arr: list):
    while start_index < end_index:
        temp = arr[start_index]
        arr[start_index] = arr[end_index]
        arr[end_index] = temp

        start_index += 1
        end_index -= 1

def rotate_list(K: int, arr: list):
    N = len(arr)
    K = K % N

    # reversing whole
    reverse_list(0, N - 1, arr)

    # reversing first half
    reverse_list(0, K - 1, arr)

    # reversing second half
    reverse_list(K, N - 1, arr)

arr = [1, 2, 3, 4, 5, 6, 7]
rotate_list(K=4, arr=arr)
print(f"after rotating 4 times: {arr}")