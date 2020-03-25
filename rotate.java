static int[] rotLeft(int[] a, int d) {
        int[] tmp = new int[a.length];
        for (int i=0; i<d;i++) {
            int pop = a[0];
            int j = 0;
            while (j<a.length-1) {
                tmp[j]=a[j+1];
                j++;
            }
            tmp[j]=pop;
            a = tmp.clone();

        }
        return tmp;
