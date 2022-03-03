static int isPresent(long arr[], int n, long k)
{
	// Your code here
    int start = 0;
    int end = n - 1;

    while (start <= end) {
        int middle = (start + end) / 2;

        if (arr[middle] == k) {
            // found the k
            return 1;
        } else if (arr[middle] < k) {
            // continue searching to the right
            start = middle + 1;
        } else {
            // search searching to the left
            end = middle - 1;
        }
    }
	// k wasn't found
    return -1;
}