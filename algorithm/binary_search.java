import java.util.*;

public class HelloWorld{

    public static void main(String []args){
        final int[] ary = {1,2,3,4,5,6,7}; // 정렬되어 있는 리스트에서 사용가능.
        List<Integer> sort = new ArrayList<Integer>();
        for (int i : ary) sort.add(i);
        System.out.println(binarySearch(sort, 2));
    }
    // 시간 복잡도 O(n)    
    public static boolean binarySearch(final List<Integer> numbers, final Integer value) {
          if(numbers == null || numbers.isEmpty()) return false;
          
          final Integer comparison = numbers.get(numbers.size()/2);
          if(value.equals(comparison)) return true;
          if(value < comparison) {
            return binarySearch(numbers.subList(0,numbers.size()/2),value);
          } else {
            return binarySearch(numbers.subList(numbers.size()/2+1, numbers.size()), value);
          } 
        }
}
