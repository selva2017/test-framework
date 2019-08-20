$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberExample.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login test",
  "description": "",
  "id": "login-feature;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I will be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify the text \"Parameter...\"",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberSteps.i_navigate_to_gmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberSteps.i_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberSteps.i_will_be_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Parameter...",
      "offset": 19
    }
  ],
  "location": "CucumberSteps.i_verify_the_text(String)"
});
formatter.result({
  "status": "skipped"
});
});