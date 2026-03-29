public class FindDuplicates {
  public static void findDuplicates (int[] arr) {
    Hashset<Integer> set = new Hashset<>();

  for (int num : arr) {
    if (set.contains(num)) {
      System.out.println("Duplicates : " + num);
    } else {
      set.add(num);
    }
  }
  }
}
