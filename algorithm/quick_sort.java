public static List<Integer> quicksort(List<Integer> numbers){  // pivot이 최소값이나 최대값일 경우 O(n^2)  , 평균적으로는 (n log n)
  if(numbers.size() < 2) return numbers;
  final Integer pivot = numbers.get(0);
  final List<Integer> lower = new ArrayList<>();
  final List<Integer> higher = new ArrayList<>();
  for(int i=1;i<numbers.size();i++){
    if(numbers.get(i) < pivot ) {
      lower.add(numbers.get(i));
    } else {
      higher.add(numbers.get(i));
    }
  }
  final List<Integer> sorted = quicksort(lower);
  sorted.add(pivot);
  sorted.addAll(quicksort(higher));
  
  return sorted;
}
