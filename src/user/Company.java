package user;

public class Company {

    public static void main(String[] args){

        Company.metod();



    }
    public static void metod(){

        Company company = new Company();

        Company.Sector sector = company.new Sector();

        System.out.println(sector.toString());


    }

    public class Sector{

        Sector sector = new Sector();

    }
}
