public class SearchDriver {

  public static void BinTime(Comparable[] a, int b) {
    long BinStart = System.currentTimeMillis();
    BinSearch.binSearch(a, b);
    long BinEnd = System.currentTimeMillis();
    long BinTot = BinEnd - BinStart;
    System.out.println("Time it took: " + BinTot + " milliseconds");
  } // BinTime

  public static void LinTime(Comparable[] a, int b) {
    long LinStart = System.currentTimeMillis();
    LinSearch.linSearch(a, b);
    long LinEnd = System.currentTimeMillis();
    long LinTot = LinEnd - LinStart;
    System.out.println("Time it took: " + LinTot + " milliseconds");
  } // LinTime

  public static void main(String[] args) {
    BinSearch BinTrial = new BinSearch();
    LinSearch LinTrail = new LinSearch();
    Comparable[] Test1 = new Integer[100000000];
    for (int i = 0; i < Test1.length; i ++) {
      Test1[i] = i;
    }
    Comparable[] Test2 = new Integer[100000000]; // my computers maximum is 1000000000
    for (int i = 0; i < Test2.length; i ++) {
      Test2[i] = i;
    }
    BinTime(Test1, 1000000);
    LinTime(Test1, 1000000);


  } // main

}
