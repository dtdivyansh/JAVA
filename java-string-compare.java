public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int size = k,p=0;
        int i=0,n=s.length(),j=0;
        String[] arr = new String[n];
        while(size<=s.length())
        {
            arr[j] = s.substring(i,size);
            j++;
            i++;
            size++;
        }
        
        for(i=0;i<j-1;i++){
            for(p=i+1;p<j;p++){
                if( arr[i].compareTo(arr[p])>0 ){
                    String temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                }
            }
        }
        
        //System.out.println(arr[0]);
        smallest = arr[0];
        largest = arr[j-1];
        
        return smallest + "\n" + largest;
    }
