class ArrayExample {
    void demoArray() {
        int[] ages = new int[3];
        // float [] weights = new float[3];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println("Length of Array: " + ages.length);

        System.out.println("Print value using for loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("Print value using for each loop:");
        for (int age : ages) {
            System.out.println(age);
        }

        System.out.println("Print value using while loop:");
        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            i++;
        }
    }

    void multiArray() {
        // int [][] multi = new int [2][2];
        int[][] arr = { { 1, 2, 1 }, { 3, 4, 2 }, { 5, 6, 3 } };
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // for(int i=0; i < arr.length; i++){
        // for(int j=0; j < arr[i].length; j++){
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

    ////// TRY THIS ///////
    // Q1- Calculate the sum of all the elements in the given arrays
    // i/p = arr[] = {1,5,3}
    // o/p = 9
    void arraySum(){
        int [] arr = {1, 5, 3};
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    // Q2- Calculate the maximum value out of all the elements in the array.
    // i/p = arr[]={1,5,3}
    // o/p = 5
    void maxOFArray(){
        int [] arr = {1, 5, 3,6,9,3,6};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            // ans = Math.max(ans, arr[i]);
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
    // Q3- Search the given element x in the array. If present then return the index else return -1.
    // i/p = arr[] = {1,4,5,6}
    //           x = 4
    // o/p = 1
    void searchInArray(){
        int [] arr = {1,5,3,6,9,3,6};
        int x = 3;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans = i;
                break;
            }
        }
        System.out.println("Found "+x+" at index: "+ans);
    }

}


class Main {
    public static void main(String[] args) {
        ArrayExample obj_1 = new ArrayExample();
        // obj_1.demoArray();
        // obj_1.multiArray();
        // obj_1.arraySum();
        // obj_1.maxOFArray();
        obj_1.searchInArray();
    }
}