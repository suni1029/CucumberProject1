@tag
Feature:
As Admin user i want user ERP module
@supplier
Scenario Outline:
i want add suppliers with multiple data
Given Launch browser as"<Browser>"
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When click Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for Supplier number with "name" and "x_Supplier_Number" and "10"
When Capture Supplier number with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When wait for ConfirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10" 
When click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" 
When Verify SupplierNumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples: 
|suppliername|address|city|country|cperson|pnumber|mail|mnumber|note|
|Testing1|ameerpet1|Hyderbad|India|Qedgetech1|7890657890|test@gmail.com|7896545678|iam a new Supplier|
|Testing2|ameerpet1|Hyderbad|India|Qedgetech2|7890657890|test1@gmail.com|7896545678|iam a new Supplier|
|Testing3|ameerpet1|Hyderbad|India|Qedgetech3|7890657890|test2@gmail.com|7896545678|iam a new Supplier|
|Testing4|ameerpet1|Hyderbad|India|Qedgetech4|7890657890|test3@gmail.com|7896545678|iam a new Supplier|

@Customer
Scenario Outline:
validate Customer with multiple data
Given Launch browser as"<Browser>"
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for  Customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]" and "10"
When click Customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for Customer number with "name" and "x_Customer_Number" and "10"
When Capture Customer number with "name" and "x_Customer_Number"
When Enter in "<Customername>" with "name" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//input[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When wait for ConfirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10" 
When click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" 
When Verify CustomerNumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|Customername|address|city|country|cperson|pnumber|mail|mnumber|note|
|ramu1|ameerpet1|Hyderabad|India|Qedge1|76457567678|Test1@gmail.com|67567867567|iam new customer|
|ramu2|ameerpet3|Hyderabad|India|Qedge3|76457567678|Test2@gmail.com|67567867567|iam new customer|
|ramu3|ameerpet4|Hyderabad|India|Qedge12|76457567678|Test3@gmail.com|67567867567|iam new customer|
|ramu4|ameerpet5|Hyderabad|India|Qedge1|376457567678|Test4@gmail.com|67567867567|iam new customer|




