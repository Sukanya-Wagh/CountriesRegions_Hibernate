import dao.CountryDAO;
import dao.RegionDAO;
import model.Country;
import model.Region;

import java.util.List;

public class Main
{
    public static <T> void printList(String header, List<T> list)
    {
        System.out.println("\n========= " + header + " =========");
        if (list.isEmpty()) {
            System.out.println("No records found.");
        } else {
            list.forEach(System.out::println);
        }
        System.out.println("========================================\n");
    }

    public static void main(String[] args) {
        RegionDAO regionDAO = new RegionDAO();
        CountryDAO countryDAO = new CountryDAO();

        countryDAO.getAllCountries().forEach(c -> countryDAO.deleteCountry(c.getCountryId()));
        regionDAO.getAllRegions().forEach(r -> regionDAO.deleteRegion(r.getRegionId()));
        System.out.println("Old data cleared from database.");

        Region asia = new Region(1, "Asia");
        Region europe = new Region(2, "Europe");
        Region africa = new Region(3, "Africa");
        regionDAO.insertRegion(asia);
        regionDAO.insertRegion(europe);
        regionDAO.insertRegion(africa);
        System.out.println("Regions inserted.");

    
        Country india = new Country("IN", "India", asia);
        Country france = new Country("FR", "France", europe);
        Country nigeria = new Country("NG", "Nigeria", africa);
        countryDAO.insertCountry(india);
        countryDAO.insertCountry(france);
        countryDAO.insertCountry(nigeria);
        System.out.println("Countries inserted.");

        printList("All Regions", regionDAO.getAllRegions());
        printList("All Countries", countryDAO.getAllCountries());

    
        asia.setRegionName("South Asia");
        regionDAO.updateRegion(asia);

        india.setCountryName("Bharat");
        countryDAO.updateCountry(india);
        System.out.println(" Updated Region and Country.");

     
        printList("Updated Regions", regionDAO.getAllRegions());
        printList("Updated Countries", countryDAO.getAllCountries());

    
        countryDAO.deleteCountry("FRANCE");  
        regionDAO.deleteRegion(2);     
        System.out.println(" Deleted country 'FRANCE' and region '2'.");

     
        printList("Remaining Countries", countryDAO.getAllCountries());
        printList("Remaining Regions", regionDAO.getAllRegions());
    }
}
