static long repeatedString(String s, long n) {
        char [] arr = s.toCharArray();
        long count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a') {
                count++;
            }
        }
        long f = n/arr.length;
        long rem = n%arr.length;
        long ic = f*count;
        for (int i = 0; i < rem; i++) {
            if(arr[i] == 'a') {
                ic++;
            }
        }
        return ic;
    }
