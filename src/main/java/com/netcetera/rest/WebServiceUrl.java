package com.netcetera.rest;

public interface WebServiceUrl {

  String Prefix = "/rest";

  String Menu = Prefix + "/menu";
  String Restaurant = Prefix + "/restaurant";
  String Location = Prefix + "/location";
  String LocationRestaurant = Prefix + "/locationRestaurant";
  String Order = Prefix + "/mealOrder";
  String Date = Prefix + "/date";
  String Admin = Prefix + "/admin";
  String Superadmin = Prefix + "/superadmin";

  String Login = Prefix + "/account";
  String User = Prefix + "/user2";
}
