package day2;

public class ContainerNrml {
    public static void main(String[] args) {
        var result = getMaximumArea(new int[]{3,7,5,6,8,4});
        System.out.println(result);
    }
    public static int getMaximumArea(int[] containerArray) {
          int area = 0;
          for (int i = 0; i < containerArray.length; i++) {
              for (int j = 1; j < containerArray.length; j++) {
                  var calculatedArea = Math.min(containerArray[i],containerArray[j]) * (j -i);   //min is used here because we are here to check the with another wall only not with y axis
                  if (calculatedArea > area)
                      area = calculatedArea;
              }
          }
          return area;
    }
}
