package testing_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTests {

    // zaczynamy od adnotacji testng

//    @Test	Marks a class or a method as part of the test.
//    alwaysRun 	If set to true, this test method will always be run even if it depends on a method that failed.
//    dataProvider 	The name of the data provider for this test method.
//    dataProviderClass 	The class where to look for the data provider. If not specified, the data provider will be looked on the class of the current test method or one of its base classes. If this attribute is specified, the data provider method needs to be static on the specified class.
//    dependsOnGroups 	The list of groups this method depends on.
//    dependsOnMethods 	The list of methods this method depends on.
//    description 	The description for this method.
//    enabled 	Whether methods on this class/method are enabled.
//    expectedExceptions 	The list of exceptions that a test method is expected to throw. If no exception or a different than one on this list is thrown, this test will be marked a failure.
//    groups 	The list of groups this class/method belongs to.
//    invocationCount 	The number of times this method should be invoked.
//    invocationTimeOut 	The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
//    priority 	The priority for this test method. Lower priorities will be scheduled first.
//    successPercentage 	The percentage of success expected from this method
//    singleThreaded 	If set to true, all the methods on this test class are guaranteed to run in the same thread, even if the tests are currently being run with parallel="methods". This attribute can only be used at the class level and it will be ignored if used at the method level. Note: this attribute used to be called sequential (now deprecated).
//    timeOut 	The maximum number of milliseconds this test should take.
//    threadPoolSize 	The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount.
//    Note: this attribute is ignored if invocationCount is not specified

    @Test(priority = 10, groups = "testsWithoutAsserts") // tutj test oznacza krok testowy
    public void firstStep() {  // testng uruchamia test w kolejności ALFABETYCZNEJ
        System.out.println("to jest piewszy test w testng");
    }

    @Test(priority = 2, groups = "testsWithAsserts") //prioity mozna ystawiać kolejność
    public void secondStep() {
        System.out.println("to jest drugi test w testng");
        int result = 0;
        int x=2, y=3;
        result = x+y;
        Assert.assertEquals(result, 6, "Niepoprawa wartość"); // Assercja sprawdzenie, na początku w nawiasie podajemy to jaki jest rezulatat a po przecinku to czego oczekujemy a ostatni parapter to komynikat, ale on nie jest obowiązkowy
    }

    @Test(priority = 3, dependsOnMethods = "secondStep", groups = "testsWithoutAsserts") // dependsonMethod oznacza że ten test zostanie ywkonany dopiero wtedy kiedy wyjdzie wcześniejszy
    public void myTest() {
        System.out.println("to jest mój test");

    }

}
