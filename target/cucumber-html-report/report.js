$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "login to the Application",
  "description": "",
  "id": "login-to-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Given valid username and password should be able to login to the application.",
  "description": "",
  "id": "login-to-the-application;given-valid-username-and-password-should-be-able-to-login-to-the-application.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user am on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.user_am_on_LoginPage()"
});
formatter.result({
  "duration": 2183007850,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username()"
});
formatter.result({
  "duration": 87174788,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_password()"
});
formatter.result({
  "duration": 71811239,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1216027429,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_should_see_the_homepage()"
});
formatter.result({
  "duration": 580596417,
  "status": "passed"
});
formatter.after({
  "duration": 86104917,
  "status": "passed"
});
formatter.after({
  "duration": 25920,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Given user logged in and user has to see the history page",
  "description": "",
  "id": "login-to-the-application;given-user-logged-in-and-user-has-to-see-the-history-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user logged on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "click on All history menu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should see all the information",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepagesteps.user_logged_on_Homepage()"
});
formatter.result({
  "duration": 2847922335,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.click_on_All_history_menu()"
});
formatter.result({
  "duration": 1086284232,
  "status": "passed"
});
formatter.match({
  "location": "Homepagesteps.user_should_see_all_the_information()"
});
formatter.result({
  "duration": 26620,
  "status": "passed"
});
formatter.after({
  "duration": 82780881,
  "status": "passed"
});
formatter.after({
  "duration": 655903405,
  "status": "passed"
});
});