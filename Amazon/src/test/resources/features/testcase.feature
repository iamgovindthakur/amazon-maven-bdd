Feature: To check the Amazon Website  Fuctionality

@Scenario1
Scenario: To check the searching and sorting fuctionality

Given Login to Amazon site www.amazon.in
When Search shampoo in amazon
Then Check Shampoo product getting display for all product
And Sort the price low to high and check the price is sorted based on low to high
And close the browser


@Scenario2
Scenario: To check the searching and sorting and add to wish List fuctionality

Given Login to Amazon site www.amazon.in
When Search shampoo in amazon
Then Check Shampoo product getting display for all product
And select Brand in left navigation filter as Dove
Then Check Dove product getting display for all product
And click any one product and add to wish list
And close the browser