package user;

public class SozlerdeIlkHerfiBoyukEden {

    public static void main(String[] args) {

        String cumle = "Allah sizi qorusun";
        String[] sozler = cumle.split(" ");
        StringBuilder yeniCumle = new StringBuilder();

        for (String soz : sozler) {
            String ilkHerfBoyuk = soz.substring(0, 1).toUpperCase() + soz.substring(1);
            yeniCumle.append(ilkHerfBoyuk).append(" ");
        }

        System.out.println(yeniCumle.toString().trim());
    }
}

