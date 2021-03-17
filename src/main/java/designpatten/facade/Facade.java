package designpatten.facade;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class Facade {

    private AdminOfIndustry adminOfIndustry = new AdminOfIndustry();
    private Bank bank = new Bank();
    private Taxation taxation = new Taxation();

    public Company openCompany(String name){
        Company company = adminOfIndustry.register(name);
        bank.openAccount(company.getId());
        taxation.applyTaxCode();
        return company;
    }
}
