$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginWithExcel.feature");
formatter.feature({
  "line": 2,
  "name": "JBK Offline Application",
  "description": "",
  "id": "jbk-offline-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@excel"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login test",
  "description": "",
  "id": "jbk-offline-application;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user should be on login page for Excel login",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters uname and pass from Excelsheet",
  "keyword": "When "
});
formatter.match({
  "location": "LoginWithExcel.user_should_be_on_login_page_for_Excel_login()"
});
formatter.result({
  "duration": 14816935700,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithExcel.user_enters_uname_and_pass_from_Excelsheet()"
});
formatter.result({
  "duration": 101797902600,
  "status": "passed"
});
});