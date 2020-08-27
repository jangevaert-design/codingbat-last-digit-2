public class lastDigit2 {
  public boolean lastDigit2(int a, int b, int c) {
    return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
  }
}
