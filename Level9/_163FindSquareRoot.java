package Level9;

class _163FindSquareRoot {


    public static int mySqrt(int n){

        if(n<2){
            return n;
        }
        int left = 1;
        int right = n / 2;
        int result = 0;

      while(left<right) {

          int mid = left + (right - left) / 2;

          if (mid <= n / mid) {
              result = mid;

              left = mid + 1;
          } else {
              right = mid - 1;
          }
      }

return result;

    }




    public static void main(String[] args) {


        System.out.println(mySqrt(27));

    }


}

