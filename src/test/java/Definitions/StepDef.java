package Definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDef {


    @Given("Table with two rows and multiple columns as Maps")
    public void table_with_two_rows_and_multiple_columns(DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);

            System.out.println(data);
    }
  @When("Other Table with two rows and multiple columns as lists")
    public void testparsetableasMaps(DataTable dataTable){

      List<List<String>> dataLists = dataTable.asLists(String.class) ;
      System.out.println(dataLists);
    }
    @When("^I Enter My Regular Expenses$")
    public void I_Enter_My_Regular_Expenses(DataTable dataTable) throws Throwable {
        List<List<String>> userDataList=dataTable.asLists(String.class);
        for(List<String> e:userDataList) {
            System.out.println(e);
        }
    }
    @And("Table with two rows and multiple columns as Map")
    public void testparsetableasoneMap(DataTable dataTable){

        Map<String, String> cred  = dataTable.asMap(String.class, String.class);
        System.out.println(cred);
    }
}
