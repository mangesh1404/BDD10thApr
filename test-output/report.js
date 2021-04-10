$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "JBK Offline Application",
  "description": "",
  "id": "jbk-offline-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
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
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters uname and pass and click login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user will be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 31384140000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_uname_and_pass_and_click_login_button()"
});
formatter.result({
  "duration": 10019435200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_will_be_on_home_page()"
});
formatter.result({
  "duration": 22004300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify logo",
  "description": "",
  "id": "jbk-offline-application;verify-logo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user should be on login page for logo",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user should see JBK logo",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_on_login_page_for_logo()"
});
formatter.result({
  "duration": 10609424100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_see_JBK_logo()"
});
formatter.result({
  "duration": 306112400,
  "status": "passed"
});
});