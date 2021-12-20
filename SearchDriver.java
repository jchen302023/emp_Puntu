public class SearchDriver {

  public static long BinTime(Comparable[] a, int b, int c) {
    long BinStart = System.currentTimeMillis();
    for (int i = 0; i <  c; i ++) {
          BinSearch.binSearch(a, b);
    } //
    long BinEnd = System.currentTimeMillis();
    long BinTot = BinEnd - BinStart;
    System.out.println("Time it took: " + BinTot + " milliseconds");
    return BinTot;
  } // BinTime

  public static long LinTime(Comparable[] a, int b) {
    long LinStart = System.currentTimeMillis();
    LinSearch.linSearch(a, b);
    long LinEnd = System.currentTimeMillis();
    long LinTot = LinEnd - LinStart;
    // System.out.println("Time it took: " + LinTot + " milliseconds");
    return LinTot;
  } // LinTime

  public static void main(String[] args) {
    BinSearch BinTrial = new BinSearch();
    LinSearch LinTrail = new LinSearch();
    Comparable[] Test1 = new Integer[100000000];
    for (int i = 0; i < Test1.length; i ++) {
      Test1[i] = i;
    }

    int randomInt = (int) (Math.random() * (Test1.length + 1));
    BinTime(Test1, randomInt, 1000000);

    /*
    long LinAverage = (LinTime(Test1, 80001) + LinTime(Test1, 80001) + LinTime(Test1, 80001) + LinTime(Test1, 80001) + LinTime(Test1, 80001)) / 5;
    System.out.println("Average time for LinTime: " + LinAverage + " milliseconds");
    long BinAverage = (BinTime(Test1, 80001) + BinTime(Test1, 80001) + BinTime(Test1, 80001) + BinTime(Test1, 80001) + BinTime(Test1, 80001)) / 5;
    System.out.println("Average time for BinTime: " + BinAverage + " milliseconds");
    */



  } // main

}
