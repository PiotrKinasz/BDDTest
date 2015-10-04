$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket",
  "description": "",
  "name": "Logged out customer is able to add items on promo to basket",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 4988731553,
  "status": "passed"
});
formatter.scenario({
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket;add-items-on-offer-\u0027buy-any-xx-for-xx\u0027-to-the-basket",
  "description": "",
  "name": "Add items on offer \u0027Buy any XX for XX\u0027 to the basket",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "a customer on Browse Shop page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "\u0027Buy any XX for XX\u0027 promo is available And promotion conditions are met",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "total amount in basket is calculated correct",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "OcadoTestScenarios.openBrowseShopPage()"
});
formatter.result({
  "duration": 8034705205,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.searchItem()"
});
formatter.result({
  "duration": 7583562576,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.checkSavingValue()"
});
formatter.result({
  "duration": 5840678480,
  "status": "passed"
});
formatter.after({
  "duration": 998097226,
  "status": "passed"
});
formatter.before({
  "duration": 3665977536,
  "status": "passed"
});
formatter.scenario({
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket;add-items-from-offers-page-to-basket",
  "description": "",
  "name": "Add items from Offers page to basket",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "a logged in customer",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "Offers page is displayed",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "add items met promo conditions to trolley",
  "keyword": "Then ",
  "line": 13
});
formatter.match({
  "location": "OcadoTestScenarios.loginToOcadoAsCustomer()"
});
formatter.result({
  "duration": 12254097327,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.searchItem1()"
});
formatter.result({
  "duration": 11030864353,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.addItemToTrolley()"
});
formatter.result({
  "duration": 37393119716,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//li[@id\u003d\u0027item*\u0027]\"}\nCommand duration or timeout: 30.10 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027Piotrek-Piotrek\u0027, ip: \u0027192.168.0.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_17\u0027\n*** Element info: {Using\u003dxpath, value\u003d//li[@id\u003d\u0027item*\u0027]}\nSession ID: 561f3673-01f5-45d8-b2c7-2773a346cc33\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d41.0.1}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:525)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat com.ocado.bdd.OcadoTestScenarios.addItemToTrolley(OcadoTestScenarios.java:100)\r\n\tat ✽.Then add items met promo conditions to trolley(Test.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//li[@id\u003d\u0027item*\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027Piotrek-Piotrek\u0027, ip: \u0027192.168.0.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_17\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Piotrek/AppData/Local/Temp/anonymous7266821452899500541webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10667)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Piotrek/AppData/Local/Temp/anonymous7266821452899500541webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:623)\r\n"
});
formatter.after({
  "duration": 869046852,
  "status": "passed"
});
formatter.before({
  "duration": 4080989623,
  "status": "passed"
});
formatter.scenario({
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket;as-logged-out-customer-add-half-price-item-to-basket",
  "description": "",
  "name": "As logged out customer add Half price item to basket",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "a customer on Browse Shop1 page",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "customer add item in Half price promo to basket",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "saving field is updated And contains correct savings value",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "OcadoTestScenarios.openBrowseShopPage3()"
});
formatter.result({
  "duration": 7450258362,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.customerAddIteminHalfPriceToBasket()"
});
formatter.result({
  "duration": 9897176710,
  "status": "passed"
});
formatter.match({
  "location": "OcadoTestScenarios.savingFieldIsUpdatedAndContainsCorrect()"
});
formatter.result({
  "duration": 2162071614,
  "status": "passed"
});
formatter.after({
  "duration": 831734004,
  "status": "passed"
});
});