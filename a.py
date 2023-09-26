import heapq

def find_k_largest(arr, k):
    min_heap = []

    for num in arr:
        if len(min_heap) < k:
            heapq.heappush(min_heap, num)
        else:
            if num > min_heap[0]:
                heapq.heappop(min_heap)
                heapq.heappush(min_heap, num)

    return min_heap[0]

# Input
input_arr = input("Enter array elements separated by spaces: ")
arr = list(map(int, input_arr.split()))
k = int(input("Enter the value of k: "))

# Output
result = find_k_largest(arr, k)
print(result)
