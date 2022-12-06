package net.serenitybdd.demos.todos.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        features = "src/test/resources/features"
                features = "src/test/resources/features/record_todos/add_new_items_to_the_todo_list.feature"



)
public class CucumberTestSuite {}
