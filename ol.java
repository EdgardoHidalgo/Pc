public class ol {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] sumArray = {4,36,4,23,867};
        int[] subArray = {785675, 56, 5675, 56544, 234};
        int[] prodArray = {6, 8, 20, 23, 12};
        int sum = 0;
        int resta = 0;
        int mult = 1;

        // User 1 fer la suma dels elements de sumArray
      for (int i = 0; i < sumArray.length; i++) {
          sum+=sumArray[i];

      }
        System.out.println("La suma del array es :" +sum);


        // User 2 fer la resta dels elements de subArray
        for (int i = 0; i < subArray.length; i++) {
            resta-=subArray[i];
        }
        System.out.println("La resta del array es :" + resta);
        // User 3 fer la multiplicació dels elements de prodArray
        for (int i = 0; i < subArray.length; i++) {
          mult*=prodArray[i];
        }
        System.out.println("La mult del array es :" +mult);
    }
}
