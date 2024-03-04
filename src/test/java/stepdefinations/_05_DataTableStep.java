package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class _05_DataTableStep {
    @When("I write username {string}")
    public void iWriteUsername(String name) {
        System.out.println("Name : " + name);
    }

    @And("I write username and password {string} and {string}")
    public void iWriteUsernameAndPasswordAnd(String username, String password) {
        System.out.println("Name :" + username);
        System.out.println("Password : " + password);


    }

    @When("I write usernames as DataTable")
    public void i_write_usernames_as_data_table(DataTable userNames) {
        List<String> listOfUsers = userNames.asList(String.class);

        for (String users : listOfUsers) {
            System.out.println(" User :" + users);
        }
    }

    @When("I write username and password as DataTable")
    public void i_write_username_and_password_as_data_table(DataTable users) {
       List<List<String> > userList = users.asLists(String.class);
       for (int i = 0; i< userList.size();i++){
           System.out.println(userList.get(i).get(0)
           + " " + userList.get(i).get(1));
       }
    }
}