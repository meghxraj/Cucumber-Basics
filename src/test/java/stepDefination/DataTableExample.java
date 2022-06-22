package stepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTableExample {

	@Given("User has to so some task")
	public void user_has_to_so_some_task() {
		System.out.println("Datatable do task example");
	}

	@Then("getting data from datatable below")
	public void getting_data_from_datatable_below(DataTable scenarioData) {
		// DataTable should be imported from io.cucumber package
		// Data table return type is List<List<Object>>

		List<List<String>> data = scenarioData.asLists(); // use asLists not asList

		// data.stream().forEach(e -> System.out.println(e));
		data.stream().forEach(System.out::println);
	}

	@Then("getting data from datatable below as Maps")
	public void getting_data_from_datatable_below_as_maps(DataTable dataTable) {
		// geting the data from feature as a Map
		// the return type will be List< Map<Object,Object> >
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class); // String.class is used to define the type od data
		map.stream().forEach(e -> {
			System.out.println("Name : " +e.get("name"));
			System.out.println("Place: "+e.get("place"));
		});
	}

	@Then("this is not same as the example keyword")
	public void this_is_not_same_as_the_example_keyword() {
		System.out.println("exit datatable");
	}

}
