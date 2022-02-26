public class Opgave1 {

    /**
     *
     * @param tal
     * @return 1-4
     */
    public int f(int tal) {
        if(tal<7)
            return 1;
        else if(tal<9)
            return 2;
        else if(tal<13)
            return 3;
        else
            return 4;
    }

    /**
     *
     * @param nr
     * @param besked
     * @return a string
     */
    public String udskriv(int nr,String besked) {
        if (nr < 100) {
            if (besked == "ja")
                return "Godkendt 1";
        }
        if (nr > 100) {
            if (besked == "ja")
                return "Godkendt 2";
        }
        if (nr < 100) {
            if (besked == "nej")
                return "Godkendt 4";
        }
        if (nr > 100) {
            if (besked == "nej")
                return "Godkendt 5";
        }
        if (nr == 100) {
            return "Godkendt";
        }
        return besked;
    }
}
