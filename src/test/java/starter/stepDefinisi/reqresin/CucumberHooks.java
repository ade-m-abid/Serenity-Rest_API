package starter.stepDefinisi.reqresin;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void Befor(){
        System.out.println(" Automation Tes Akan Di Eksekusi ");
    }

    @After
    public  void After(){
        System.out.println(" Automation Tes Selesai Di Eksekusi");
    }
}
