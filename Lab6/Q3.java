
public class Q3 {
  static int pentagonNum(int n){
    return n * (3 * n - 1) / 2; 
  }
  public static void main(String[] args) {
    int cnt = 0;
    for(int i = 1; i <= 100; i++){
      System.out.print(pentagonNum(i) + "  ");
      cnt++;
      if(cnt % 10 == 0) System.out.println();
    }
  }
}
