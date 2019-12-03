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
formatter.uri("ScenarioOutline.feature");
formatter.feature({
  "line": 1,
  "name": "Sceanrio outline examples",
  "description": "",
  "id": "sceanrio-outline-examples",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Data table without header",
  "description": "",
  "id": "sceanrio-outline-examples;data-table-without-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open my application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "admin",
        "pass1234"
      ],
      "line": 6
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutline.i_open_my_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ScenarioOutline.i_login_with_following_credentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 8,
  "name": "Data table with header",
  "description": "",
  "id": "sceanrio-outline-examples;data-table-with-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I open Facebook URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "fill up the new account form with the following data",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Phone No",
        "Password",
        "DOB Day",
        "DOB Month",
        "DOB Year",
        "Gender"
      ],
      "line": 11
    },
    {
      "cells": [
        "Test FN",
        "Test LN",
        "0123123123",
        "Pass1234",
        "01",
        "Jan",
        "1990",
        "Male"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutline.i_open_Facebook_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ScenarioOutline.fill_up_the_new_account_form_with_the_following_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Create multiple new accounts in Facebook",
  "description": "",
  "id": "sceanrio-outline-examples;create-multiple-new-accounts-in-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I open Facebook URL and create new accounts with below data",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Phone No",
        "Password",
        "DOB Day",
        "DOB Month",
        "DOB Year",
        "Gender"
      ],
      "line": 16
    },
    {
      "cells": [
        "Abc FN",
        "Abc LN",
        "0123123123",
        "Pass1234",
        "01",
        "Jan",
        "1990",
        "Male"
      ],
      "line": 17
    },
    {
      "cells": [
        "Def FN",
        "Def LN",
        "0456456456",
        "Abcd1234",
        "01",
        "Feb",
        "1990",
        "Female"
      ],
      "line": 18
    },
    {
      "cells": [
        "Xyz FN",
        "Xyz LN",
        "0789789789",
        "Pass2018",
        "01",
        "Mar",
        "1990",
        "Female"
      ],
      "line": 19
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutline.i_open_Facebook_URL_and_create_new_accounts_with_below_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});