   static long arrayManipulation(int n, int[][] queries) {
        long [] arr = new long[n+1];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1];
            int k = queries[i][2];
            arr[a] += k;
            arr[b]   -= k;
        }
        long t = 0,max = 0;
        for (int i = 0; i < arr.length; i++) {
            t +=arr[i];
            if (t > max ) max = t;
        }
        return max;
    }

