
package kata3;
public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> h = new Histogram<String>();
        h.increment("hotmail.com");
        h.increment("ulpgc.es");
        h.increment("ulpgc.es");
        h.increment("gmail.com");
        h.increment("ull.es");
        HistogramDisplay hd = new HistogramDisplay(h);
        hd.execute();
    }
}
