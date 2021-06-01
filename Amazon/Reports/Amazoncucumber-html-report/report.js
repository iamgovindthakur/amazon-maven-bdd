$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/testcase.feature");
formatter.feature({
  "name": "To check the Amazon Website  Fuctionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the searching and sorting fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "name": "Login to Amazon site www.amazon.in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.steps.login_to_Amazon_site_www_amazon_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search shampoo in amazon",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.steps.search_shampoo_in_amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Shampoo product getting display for all product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.steps.check_Shampoo_product_getting_display_for_all_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sort the price low to high and check the price is sorted based on low to high",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.sort_the_price_low_to_high_and_check_the_price_is_sorted_based_on_low_to_high()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the searching and sorting and add to wish List fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "name": "Login to Amazon site www.amazon.in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.steps.login_to_Amazon_site_www_amazon_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search shampoo in amazon",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.steps.search_shampoo_in_amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Shampoo product getting display for all product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.steps.check_Shampoo_product_getting_display_for_all_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Brand in left navigation filter as Dove",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.select_Brand_in_left_navigation_filter_as_Dove()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Dove product getting display for all product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.steps.check_Dove_product_getting_display_for_all_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click any one product and add to wish list",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.click_any_one_product_and_add_to_wish_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});