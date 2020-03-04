$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("functional.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate order items",
  "description": "",
  "id": "acceptance-testing-to-validate-order-items",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate User is able to add products to cart and place order",
  "description": "",
  "id": "acceptance-testing-to-validate-order-items;validate-user-is-able-to-add-products-to-cart-and-place-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User adds two products to cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User navigate to cart and proceed to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user sign in using username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User proceed address information",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user provides shipping details",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user places order",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "check order places successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});